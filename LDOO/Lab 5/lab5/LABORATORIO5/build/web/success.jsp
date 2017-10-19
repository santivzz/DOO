<%-- 
    Document   : success
    Created on : 18/09/2017, 08:25:28 PM
    Author     : seg-5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Incio de Sesion valido</title>
    </head>
    <body>
        <h1>Inicio de sesión válido</h1>

        <h2>Hola <%= session.getAttribute("txt-usuario") %></h2>
    </body>
</html>
