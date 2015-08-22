<%-- 
    Document   : produtoJSP
    Created on : 14/08/2015, 21:00:47
    Author     : prisley.costa
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="br.pucpr.prog4.lojaVirtual.models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    
        <h1>LOJA!</h1>
        
        <c:forEach var="produto" items="${produtos}">
            <div>
                <p>${produto.nameProd}</p>
                <a href="produto-detalhe?id=${produto.cod}.jpg">
                   <img src="../Imagens/${produto.cod}.jpg" 
                        alt="/produto ${produto.cod}" />
                </a>
                <p> R$ ${produto.value}</p>
                    
            </div>
        </c:forEach>