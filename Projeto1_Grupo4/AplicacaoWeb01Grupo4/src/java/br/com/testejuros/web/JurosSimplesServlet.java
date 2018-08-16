/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testejuros.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Vinícius Lopes Lima
 */
@WebServlet(name = "JurosSimplesServlet", urlPatterns = {"/jurossimples"})
public class JurosSimplesServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            
            // Tag Responsiva
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
                
                // Carregando Google Fonts*/
               out.println("<link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet'>");
                
                // Carregando FavIcon
                out.println("<link rel=\'shortcut icon\' href=\'Imagens/favicon (1).ico\' />");
                out.println("<title> JurosWeb </title>");
                
                // Carregando o Css/Bootstrap
                out.println("<link rel=\'stylesheet\' "
                            + "href=\'https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\'\n "
                            + "integrity=\'sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\'\n "
                            + "crossorigin=\'anonymous\'>");      
                out.println("</head>");
            
            
            out.println("<title>Juros Simples</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<body style=\"background-color: #D3D3D3 \">");
            out.println("<nav class=\"navbar sticky-top navbar-dark bg-dark\">\n" +
            "<a class=\"navbar-brand\" href=\"index.html\">\n" +         
            "Home\n" +       
            "</a>\n" +  
            "</nav>");
            
            out.println("<center><h1>Calculo do Juros Simples<br><br> </center></h1>");
            out.println("<center><form method='GET'>");
            out.println("Valor empréstimo:" + "<input type='text' name='emprestimo'>");
            out.println("Valor juros:" + "<input type='text' name='juros'>");
            out.println("Meses:" + "<input type='text' name='meses'>");
            out.println("<input type='submit' value='Processar'>");
            out.println("</center>");
            out.println("</form>");
            NumberFormat moeda = NumberFormat.getCurrencyInstance();
            double emprestimo = Double.parseDouble(request.getParameter("emprestimo"));
            float juros = Float.parseFloat(request.getParameter("juros"));
            int meses = Integer.parseInt(request.getParameter("meses"));
            double resultado = ((emprestimo * (juros/100) * meses) + emprestimo);
            out.println("<br><center><h3>O valor do seu emprestimo é:" + moeda.format(resultado) + "</center></h3>");
 
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
