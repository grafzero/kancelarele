<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sprawa ${events.get(0).eventCase.signature}</h1>
        
    <c:forEach var="event" items="${events}">
        Data zdarzenia: ${event.happenedat}  RODZAJ: ${event.eventName}  </br>
        
    </c:forEach>
        
        
    </body>
</html>
