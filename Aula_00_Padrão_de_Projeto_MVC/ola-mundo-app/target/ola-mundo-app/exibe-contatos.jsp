<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.ola.mundo.dao.*, com.ola.mundo.model.*" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Exemplo 3: Exibe Contatos</title>
</head>

<body>
    <table>
        <%
          ContatoDao dao = new ContatoDao();
          List<Contato> contatos = dao.getLista();
    
          for (Contato contato : contatos) {
        %>
          <tr>
            <td><%=contato.getNome() %></td>
            <td><%=contato.getEmail() %></td>
            <td><%=contato.getEndereco() %></td>
            <td><%=contato.getDataNascimento() %></td>
          </tr>
        <%
          }
        %>
      </table>
</body>
</html>