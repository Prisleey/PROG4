package br.pucpr.prog4.lojaVirtual.controllers;

import br.pucpr.prog4.lojaVirtual.models.Produto;
import br.pucpr.prog4.lojaVirtual.models.ProdutoManager;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetalheProdutoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProdutoManager produtoM = new ProdutoManager();
        int id = Integer.parseInt(request.getParameter("id"));
        Produto produto = produtoM.obterPorId(id);
        
        request.setAttribute("produto", produto);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/produtoDetalheJSP.jsp");
        rd.forward(request, response);
    }
}
