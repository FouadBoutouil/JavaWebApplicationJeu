<%-- 
    Document   : lister-cat
    Created on : 9 juil. 2018, 16:31:59
    Author     : Administrateur
--%>
<!-- il faut ajouter cette ligne en fesant un espace ctrl dans le for each pour utiliser dans le serveur( pour le serveur) -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style1.css">
        <title>JSP</title>
    </head>
    <body>
        <h1>Liste des categories</h1>
        <c:forEach items="${listeCategorie}" var="catAct">
            ${catAct.nom}
            <a href="<c:url value="/supprimer-cat?id=${catAct.id}"/>"> Supprimer </a>
            <br><br>

        </c:forEach>

    </body>
</html>
