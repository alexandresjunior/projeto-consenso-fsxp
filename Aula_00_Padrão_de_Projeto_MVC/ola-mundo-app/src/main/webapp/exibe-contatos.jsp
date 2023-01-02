<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.ola.mundo.dao.*, com.ola.mundo.model.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false"%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Exemplo 3: Exibe Contatos</title>
</head>

<body>
    <c:import url="cabecalho.jsp" />
    <table>
      <!-- 
        A tag 'jsp:useBean' é capaz de instanciar determinada classe 
        através do construtor sem argumentos e dar um nome (id) 
        para essa variável.
       -->
      <jsp:useBean id="dao" class="com.ola.mundo.dao.ContatoDao"/>
        
      <!-- 
        A tag 'c:forEach' é capaz de iterar por uma coleção, 
        definida através do atributo 'items' e também como chamará 
        o objeto que será atribuído para cada iteração no atributo 'var'.
      -->
      <c:forEach var="contato" items="${dao.lista}">
          <tr>
            <td>${contato.nome}</td>
            <td>
              <c:if test="${not empty contato.email}">
                <a href="mailto:${contato.email}">${contato.email}</a>
              </c:if>
            </td>
            <td>
              <c:choose>
                <c:when test="${not empty contato.endereco}">
                  <i>${contato.endereco}</i>
                </c:when>
                <c:otherwise>
                  Endereço não informado
                </c:otherwise>
              </c:choose>
            </td>

            <td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" /></td>
          </tr>
      </c:forEach>
    </table>
    <c:import url="rodape.jsp" />
</body>
</html>