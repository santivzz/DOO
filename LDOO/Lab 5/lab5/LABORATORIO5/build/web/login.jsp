<%-- 
    Document   : login
    Created on : 18/09/2017, 08:24:51 PM
    Author     : seg-5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="LoginController" method="post">
        <h1>Bienvenido :) </h1>
        <br>
        Usuario: <input type="text" name="txt-usuario" placeholder="Usuario">
        <br>
        Contraseña: <input type="password" name="txt-contra" placeholder="Contraseña">
        <br>
        <input type="submit" value="Iniciar Sesión">
        </form>
    </body>
</html>
