<%-- 
    Document   : lister_client
    Created on : 10 juil. 2018, 11:55:15
    Author     : Administrateur
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>lister client</h1>
        <c:forEach items="${listerClient}" var="catAct">
            ${catAct.nom}
            <a href="<c:url value="/suprimer-client"/>" > supprimer</a>
            <br>   
        </c:forEach>
    </body>
</html>

<!--faut pas oublier les include ::::::::::::::::   c: for puis ctrl espace-->