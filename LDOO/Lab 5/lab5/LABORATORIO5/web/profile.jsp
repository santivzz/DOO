<%-- 
    Document   : profile.jsp
    Created on : 25/09/2017, 09:11:41 PM
    Author     : Daniel Eliseo Meza Corral 1743062
--%>


 <%
            if(session.getAttribute("usuario") == null);
                    response.sendRedirect("login.jsp");
  %>      

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab5</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        
    </body>
</html>
