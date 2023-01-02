<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Exemplo 2: Expression Language (EL)</title>
</head>

<body>
    <!-- 
        Uso de Expression Language para mostrar parâmetros 
        que o cliente envia através de sua requisição.
    
        Por exemplo, se o cliente chama a página testaparam.jsp?idade=24, 
        o programa deve mostrar a mensagem que o cliente tem 24 anos. 

        Para ler o parâmetro chamado idade basta usar ${param.idade}. 
    -->
    Testando seus parâmetros:<br />
    A idade é ${param.idade}.
</body>

</html>