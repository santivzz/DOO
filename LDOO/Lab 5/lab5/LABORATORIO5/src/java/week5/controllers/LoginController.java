/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import week5.models.User;
import week5.models.Authentication;

/**
 *
 * @author seg-5
 */
public class LoginController extends HttpServlet {

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
       
       HttpSession session = request.getSession();
       
       /* 
       response.setContentType("text/html;charset=UTF-8");
       RequestDispatcher dispatcher = null; */
        
       String txtusuario = request.getParameter("txt-usuario");
       String txtcontra = request.getParameter("txt-contra");
       
       boolean isValidUser = Authentication.authenticate(txtusuario,txtcontra);
       
       if(isValidUser){
           User user= new User(txtusuario,txtcontra);
           session.setAttribute("usuario",user.getUsername());
           session.setAttribute("fullname", user.getFullName());
           
           //session.setAttribute("Nombrecompleto", user.getFullName());

           /*
           dispatcher= request.getRequestDispatcher("success.jsp");
           dispatcher.forward(request,response);
       }
           */
           response.sendRedirect("profile.jsp");
       }
       else{
           response.sendRedirect("error.jsp");
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
        processRequest(request, response);
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
