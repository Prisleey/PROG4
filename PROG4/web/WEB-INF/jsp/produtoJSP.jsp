<%-- 
    Document   : produtoJSP
    Created on : 14/08/2015, 21:00:47
    Author     : prisley.costa
--%>

<%@page import="java.util.List"%>
<%@page import="br.pucpr.prog4.lojaVirtual.models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    
        <h1>LOJA!</h1>
        <%
        List<Produto> produtos;
        produtos = (List<Produto>) request.getAttribute("produtos");
        
        for(Produto p : produtos) {
        %>
            <div>
                <p><%=p.getNameProd()%></p>
                <a href="produto-detalhe?id=<%=p.getCod()%>.jpg"
                   <img src="/imagens/<%=p.getCod()%>.jpg" 
                        alt="/produto <%=p.getCod()%>" />
                </a>
                <p> R$ <%=p.getValue()%></p>
            </div>
        <%
        }
        %>
        
        
    

