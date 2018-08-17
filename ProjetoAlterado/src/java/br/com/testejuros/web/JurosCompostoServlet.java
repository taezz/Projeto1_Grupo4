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
@WebServlet(name = "JurosCompostoServlet", urlPatterns = {"/juros-composto"})
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
            out.println("<style type='text/css'>");
            out.println("@import url('folhaestilo.css');");
            out.println("</style>");
            out.println("<title>Juros Composto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='titulo-botao'>");
            out.println("<div class='titulo'>");
            out.println("<h1>Cálculo do Juros Composto</h1>");
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
            out.println("<label>Valor juros:</label>");
            out.println("<input type='text' name='taxa'>");
            out.println("<label>Meses:</label>");
            out.println("<input type='text' name='prazo'>");
            out.println("<input type='submit' value='Processar'>");
            out.println("</form>");
            out.println("</div>");
            out.println("<div class='bloco2'>");
            NumberFormat moeda = NumberFormat.getCurrencyInstance();
            int aux;
            double capital = Double.parseDouble(request.getParameter("capital"));
            double taxa = Double.parseDouble(request.getParameter("taxa"));
            int prazo = Integer.parseInt(request.getParameter("prazo"));
            aux = prazo + 1;
            double TesteTab[] = new double[aux];
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>Mês</th>");
            out.println("<th>Montante</th>");
            out.println("</tr>");
            for (int i = 0; i < aux; i++) {
                out.println("<tr>");
                if (i == 0) {
                    out.println("<td>" + i + "</td>");
                    out.println("<td>" + moeda.format(capital) + "</td>");
                } else {
                    out.println("<td>" + i + "</td>");
                    TesteTab[i] = capital * Math.pow(1 + (taxa / 100), i);
                    out.println("<td>" + moeda.format(TesteTab[i]) + "</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
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
