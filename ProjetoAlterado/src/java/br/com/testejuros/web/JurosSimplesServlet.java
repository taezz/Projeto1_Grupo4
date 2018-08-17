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
@WebServlet(name = "JurosSimplesServlet", urlPatterns = {"/juros-simples"})
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
            out.println("<style type='text/css'>");
            out.println("@import url('folhaestilo.css');");
            out.println("</style>");
            out.println("<title>Juros Simples</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='titulo-botao'>");
            out.println("<div class='titulo'>");
            out.println("<h1>Cálculo do Juros Simples</h1>");
            out.println("</div>");
            out.println("<div class='botao'>");
            out.println("<a href='home'><div class='voltar'><h3>Voltar<h3></div></a>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class='conteudo'>");
            out.println("<div class='bloco1'>");
            out.println("<form method='GET'>");
            out.println("<label>Valor do empréstimo: </label>");
            out.println("<input type='text' name='capital'>");
            out.println("<label>Taxa de juros (%):</label>");
            out.println("<input type='text' name='taxa'>");
            out.println("<label>Tempo (meses):</label>");
            out.println("<input type='text' name='prazo'>");
            out.println("<input type='submit' value='Processar'>");
            out.println("</form>");
            out.println("</div>");
            out.println("<div class='bloco2'>");
            NumberFormat moeda = NumberFormat.getCurrencyInstance();
            double emprestimo = Double.parseDouble(request.getParameter("capital"));
            float juros = Float.parseFloat(request.getParameter("taxa"));
            int meses = Integer.parseInt(request.getParameter("prazo"));
            double resultado = ((emprestimo * (juros / 100) * meses) + emprestimo);
            out.println("<div class='resultado'>");
            out.println("<h2>O montante é: " + moeda.format(resultado) + "</h2>");
            out.println("</div>");
            out.println("</div>");
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
