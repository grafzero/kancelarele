<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello chuju!</h1>
        
    <c:forEach var="case" items="${cases}">
        Sygnatura sprawy: ${case.signature} </br>
        
    </c:forEach>
        
        
    </body>
</html>
