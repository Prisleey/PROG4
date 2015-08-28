<%-- 
    Document   : cadastroCliente
    Created on : 28/08/2015, 19:56:27
    Author     : prisley.costa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meu cadastro</title>
    </head>
    <body>
        <h1>Meu cadastro!</h1>
        <form action="CadastroCliente" method="POST">
            <label for="labelTipo">Tipo Pessoa:</label><br>
            <label for="labelPF">Pessoa Fisica</label><input type="radio" name="person" value="Pessoa Fisica"><br>
            <label for="labelPJ">Pessoa Juridica</label><input type="radio" name="person" value="Pessoa Juridica"><br><br>
            <label for="labelName">Nome: </label><input type="text" name="name" id="labelName"><label for="labelName"</label><br>
            <label for="labelCPF">CPF: <input type="text" name="cpf" id="labelCPF"<br><br>
            Sexo: <select name="sexo">
                <option value="select">Selecione</option>
                <option value="fem" >Feminino</option>
                <option value="masc" >Masculino</option>
            </select><br><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
