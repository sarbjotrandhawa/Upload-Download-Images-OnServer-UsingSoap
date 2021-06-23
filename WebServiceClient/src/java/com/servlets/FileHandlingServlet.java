/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.helper.ImageDisplayHelper;
import com.services.Exception_Exception;
import com.services.FileUploadResponseDTO;
import com.services.FileUploadServiceService;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 *
 * @author macbookair
 */
@MultipartConfig
@WebServlet(name = "FileHandlingServlet", urlPatterns = {"/FileHandlingServlet"})
public class FileHandlingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FileHandlingServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FileHandlingServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FileUploadResponseDTO fileUploadResponseDTO = null;
        
        for (Part part : request.getParts()) {
            try {

                String filename = part.getSubmittedFileName();
                InputStream is = part.getInputStream();

                ByteArrayOutputStream bytes = new ByteArrayOutputStream();

                byte[] buffer = new byte[(int) part.getSize()];

                int c;
                while ((c = is.read(buffer, 0, buffer.length)) > 0) {
                    bytes.write(buffer, 0, c);
                }

                FileUploadServiceService fileUploadServiceService = new FileUploadServiceService();

                fileUploadResponseDTO = fileUploadServiceService.getFileUploadServicePort().fileSizeAndFile(filename, buffer);
                
                ImageDisplayHelper imageDisplayHelper = new ImageDisplayHelper();
                imageDisplayHelper.setSize(fileUploadResponseDTO.getFilelength());
                imageDisplayHelper.setName(fileUploadResponseDTO.getFileName());
                String convertedImage = Base64.getEncoder().encodeToString(fileUploadResponseDTO.getFile());
                imageDisplayHelper.setBase64Image(convertedImage);
                
                request.setAttribute("DisplayHelper",imageDisplayHelper);
              
                  RequestDispatcher requestDispatcher = request.getRequestDispatcher("/result.jsp");
                  requestDispatcher.forward(request, response);

            } catch (Exception_Exception ex) {
                Logger.getLogger(FileHandlingServlet.class.getName()).log(Level.SEVERE, null, ex);
            } 
          
            System.out.println("Data Write");

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
