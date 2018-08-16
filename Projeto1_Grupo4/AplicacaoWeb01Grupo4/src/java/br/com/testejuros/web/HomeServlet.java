/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testejuros.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel Lucas
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/Home.php"})
public class HomeServlet extends HttpServlet {

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
            
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
             /*Tag meta Responsiva*/
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
             /*Google fonts - footer*/
            out.println("<link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet'>");
             /*Favicon*/

            out.println("<link rel=\"shortcut icon\" href=\"Imagens/favicon (1)_1.ico\" />");

            out.println("<title> JurosWeb </title>");    
             /*css - Bootstrap*/
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
            
            out.println("</head>");
            out.println("<body style=\"background-color: lightgrey;\">"); 
            
            
            //Navbar da pagina
            
            out.println("<body style=\"background-color: #D3D3D3 \">");
            out.println("<nav class=\"navbar sticky-top navbar-dark bg-dark\">\n" +
            "<a class=\"navbar-brand\" href=\"Home.php\">\n" +         
            "Home\n" +  
            "</a>\n" +  
            "</nav>");
            
            //Caixa de MEnsagem no centro da tela
            out.println("<div class=\"jumbotron jumbotron-fluid text-center\" style=\"background-color: #D3D3D3; \">");
            out.println("<h1 >Testando a pagina</h1>");
            out.println("<p>Um texto qualquer aqui</p>");
            out.println("</div>");
            
            //links para os servlets de juros
            out.println("<div class=\"row\" style=\"width: 65%;position: relative;left: 20%; background-color: #D3D3D3;\">");
            out.println("<div class=\"col-sm-6\">");
            out.println("<div class=\"card border-secondary mb-3\" style=\"max-width: 30rem; background-color: #D3D3D3 \">"
                    + "<div class=\"card-body\" style=\"background-color: lightsteelgrey;border-color: black;\">"
                    + "<center><h5 class=\"card-title\" style=\"font-size: 30px\">Juros Simples</h5></center>"
                    + "<p><center><a href=\"jurossimples\" class=\"btn btn-primary\" style=\"background-color: lightseagreen;border-color: lightseagreen;color: black;width: 300px; height: 40px; font-size: 18px\">Calcular</a>"
                    + "</center>"
                    + "</div>" 
                    + "</div>" 
                    + "</div>");
            
            out.println("<div class=\"col-sm-6\" style=\"position: relative;left: 13%; background-color: #D3D3D3\">"
                    + "<div class=\"card border-secondary mb-3\" style=\"max-width: 30rem;\">"
                    + "<div class=\"card-body\" style=\"background-color: #D3D3D3\">"
                    + "<center><h5 class=\"card-title\" style=\"font-size: 30px\" >Juros Composto</h5></center>"
                    + "<p> <center><a href=\"juroscomposto\" class=\"btn btn-primary\" style=\"background-color: lightseagreen;border-color: lightseagreen;color: black; width: 300px; height: 40px; font-size: 18px\">Calcular</a>"
                    + "</center>"
                    + "</div>"
                    + "</div>"
                    + "</div>");
            out.println("</div>");
            out.println("<p></p>");
            
            //apresentação do integrantes
            out.println("<center><div class=\"container\" style=\"background-color: white \">"
                    + "<div class=\"row\">"
                    + "<div class=\"col-md-6\">"
                    + "<h3>Aluno 1</h3>"
                    + "<p>testetestetestestetestetestetesteteste...</p>"
                    + "<p>testetestetestestetestetestetesteteste...</p>"
                    + "</div>");
            
            out.println("<div class=\"col-md-6\">"
                    + "<h3>Aluno 2</h3>"
                    + "<p>testetestetestetestetestetestetestetestetesteteste...</p>"
                    + "<p>testetestetestetestetestetestetestetestetesteteste...</p>"
                    + "</div>");
            
            out.println("</div>");
             out.println("<div class=\"row\">"
                    + "<div class=\"col-md-6\">"
                    + "<h3>Aluno 3</h3>"
                    + "<p>testetestetestestetestetestetesteteste...</p>"
                    + "<p>testetestetestestetestetestetesteteste...</p>"
                    + "</div>");
            
            out.println("<div class=\"col-md-6\">"
                    + "<h3>Aluno 4</h3>"
                    + "<p>testetestetestetestetestetestetestetestetesteteste...</p>"
                    + "<p>testetestetestetestetestetestetestetestetesteteste...</p>"
                    + "</div>");
            
            out.println("</div>");
            out.println("</center>");
           
            
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
