# Upload-Download-Images-OnServer-UsingSoap
This demo helps to update the image from the local PC to the Derby database using Soap Web services and downloading the same image from the server by giving the name of the file and shows into a JSP page. Extensively used Java, HTML, JSP, JSTL, Servlet, Hibernate, JPA, Maven and Derby as the database user. 

----------------------- Soap Web Service ------------------------
1).Create a Maven Web Service with 2 Web Methods .

2).GetFileSize() - (If required make changes for method parameters)
  - Retrun the file size 
  - And the file
WaitFor10Secs() - (If required make changes for method parameters).


----------------------- Web Service Client. ------------------------

3).Create Maven Java Web Application.

4). Add Web Client Service Reference.

5). Add a Servlet.

6). Add @MultipartConfig to servlet (Very Important).
In doPost() add the following to get the FileName and the byte[]
     //get file
      for (Part part : request.getParts())
      {
                  String filename = part.getSubmittedFileName();
                  ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                  byte[] buffer = new byte[(int)part.getSize()];
      }
      
7). In index.jsp add .
<form name="Upload" action="<ServletName>" method="post" enctype="multipart/form-data">
            <input type="file" name="file" />
<input type="submit" value="Upload" />
</form>


8). Call Web service GetFileSize() method and get the file size.
9). Call WaitFor10Secs() method before showing the result and let the response wait for 10 secs before displaying on the page.
