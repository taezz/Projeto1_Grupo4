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
 * @author Vinícius Lopes Lima
 */
@WebServlet(name = "JurosCompostoServlet", urlPatterns = {"/juroscomposto"})
public class JurosCompostoServlet extends HttpServlet {

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
            out.println("<title>Juros Composto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculo do Juros Composto</h1>");
            
            out.println("<form method='GET'>");
            out.println("Valor do empréstimo:" + "<input type='text' name='capital'>");
            out.println("Valor juros:" + "<input type='text' name='taxa'>");
            out.println("Meses:" + "<input type='text' name='prazo'>");
            out.println("<input type='submit' value='Processar'>");
            out.println("</form>");
            
            double montante;
            //double TaxaAuxiliar;
            double capital = Double.parseDouble(request.getParameter("capital"));
            double taxa = Double.parseDouble(request.getParameter("taxa"));
            int prazo = Integer.parseInt(request.getParameter("prazo"));
            
            montante = capital * Math.pow (1+(taxa/100), prazo);
            
            out.println("<h2>O valor do seu emprestimo é:" + montante + "</h2>");
            out.println("<h2>Servlet jurosSimples at " + request.getContextPath() + "</h1>");
            out.println("<h4><a href='index.html'>Voltar</a></h4>");
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
