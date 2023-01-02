<%@ page import="java.util.*, com.ola.mundo.dao.*, com.ola.mundo.model.*" %>
<html>

<head><title>Meu primeiro JSP</title></head>

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