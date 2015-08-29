/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaVirtual.controllers;

import br.pucpr.prog4.lojaVirtual.models.Cliente;
import com.sun.xml.internal.ws.spi.db.BindingContextFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CadastroClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/cadastroCliente.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cli = new Cliente();
        cli.setNome(request.getParameter("name"));
        cli.setSexo(request.getParameter("sexo"));
        cli.setCpf(request.getParameter("cpf"));
        cli.setTipoPessoa(request.getParameter("person"));
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataNascimento = sdf.parse(request.getParameter("dataNasc"));
        } catch (ParseException e) {
            Logger.getLogger(CadastroClienteServlet.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
