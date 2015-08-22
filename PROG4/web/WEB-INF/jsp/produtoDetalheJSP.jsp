<%-- 
    Document   : produtoDetalheJSP
    Created on : 21/08/2015, 20:42:42
    Author     : prisley.costa
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Detalhe Produto!</h1>
        <c:forEach var="produto" items="${produtos}">
            <div>
                
            </div>
        </c:forEach>
    </body>
</html>
