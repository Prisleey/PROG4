package br.pucpr.prog4.lojaVirtual.controllers;

import br.pucpr.prog4.lojaVirtual.models.Produto;
import br.pucpr.prog4.lojaVirtual.models.ProdutoManager;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProdutoListaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProdutoManager prodManager = new ProdutoManager();
        
        List<Produto> produtos;
        produtos = prodManager.obterTodos();
        
        request.setAttribute("produtos", produtos);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/produtoJSP.jsp");
        rd.forward(request, response);
    }
}
