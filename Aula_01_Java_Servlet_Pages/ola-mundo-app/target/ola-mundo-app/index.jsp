<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Meu primeiro JSP</title>
</head>

<body>
    <table>
    <%-- Comentário: nossa primeira página JSP --%>

      <%
        String mensagem = "Bem vindo(a)!";

        out.println(mensagem);
      %>

      <br/>

      <%
        String desenvolvido = "Desenvolvido por Alexandre Jr.";

        out.println(desenvolvido);
      %>

      <br/>

      <%
        System.out.println("Tudo foi executado!");
      %>
</body>
</html>