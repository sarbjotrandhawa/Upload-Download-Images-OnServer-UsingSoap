/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.FileStorageSoapWebService.controller.ImagesJpaController;
import com.FileStorageSoapWebService.model.FileUploadResponseDTO;
import com.FileStorageSoapWebService.model.Images;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author macbookair
 */
@WebService
public class FileUploadService {

    @WebMethod
    public FileUploadResponseDTO fileSizeAndFile(@WebParam(name = "fileName") String fileName, @WebParam(name = "data") byte[] data) throws Exception {

        EntityManagerFactory entityManagerFactory = new Persistence().createEntityManagerFactory("FileStorageSoapWebServicePU");
        ImagesJpaController imagesJpaController = new ImagesJpaController(entityManagerFactory);

        Images image = new Images();
        image.setFilename(fileName);
        image.setData(data);
        image.setId(imagesJpaController.getImagesCount() + 1);
        imagesJpaController.create(image);
        
        waitFor10Sec();
        
        Images img = imagesJpaController.findAll().stream().filter(x -> x.getFilename().equals(fileName)).findFirst().orElse(null);
        return new FileUploadResponseDTO(img.getData().length, img.getFilename(), img.getData());
    }

    @WebMethod
    public void waitFor10Sec() throws InterruptedException {
        Thread.sleep(10000);
    }

}
