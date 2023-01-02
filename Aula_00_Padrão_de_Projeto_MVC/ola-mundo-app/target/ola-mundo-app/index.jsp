<html>

<head><title>Meu primeiro JSP</title></head>

<body>
    <%-- Comentário: nossa primeira página JSP --%>

    <%
        String mensagem = "Bem vindo ao sistema em JSP!";

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