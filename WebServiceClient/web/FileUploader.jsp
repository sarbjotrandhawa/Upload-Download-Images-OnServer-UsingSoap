<%-- 
    Document   : FileUploader
    Created on : 21 Jun, 2021, 4:12:50 PM
    Author     : macbookair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <h1>Please select a file to upload.</h1>
        <form name="Upload" action="FileHandlingServlet" method="post" enctype="multipart/form-data">
            <input type="file" name="file" />
            <input type="submit" value="Upload" />
        </form>
        </div> 
    </body>
</html>
