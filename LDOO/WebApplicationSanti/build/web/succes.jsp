<%-- 
    Document   : succes
    Created on : 21/09/2017, 08:21:03 PM
    Author     : Mate_18
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inicio de sesion valido</h1>
        <h2>Hola <%= request.getAttribute("username") %></h2>
    </body>
</html>
