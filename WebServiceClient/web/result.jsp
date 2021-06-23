<%-- 
    Document   : result.jsp
    Created on : 21 Jun, 2021, 7:52:42 PM
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
            <h1>Detail of file:</h1>
    <h2>File Size: ${DisplayHelper.size}</h2>
    <h3>File Name: ${DisplayHelper.name}</h3><br><br>
    <img src="data:image/jpg;base64,${DisplayHelper.getBase64Image()}" width="300" height="300"/>
</div>
    </body>
</html>
