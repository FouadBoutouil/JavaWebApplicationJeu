<%-- 
    Document   : _THEME
    Created on : 10 juil. 2018, 16:42:53
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Cache-Control" content="no cache">

        <title>JSP Page</title>
        <c:import url="_STYLESHEETS.jsp"/>
    </head>
    <body>
        <c:import url="_TITRE.jsp" />
        <c:import url="_MenuHomePage.jsp" />
        <section>
            <div>

                <h1> Login</h1>

                <form method="post">
                    <input type="text" name="login"> PSEUDO</input>
                    <input type="password" name="mdp">MOT DE PASSE </input>
                    <input type="submit" value="ENTRER">
                    <input type="reset" value="ENTRER">      
                </form>

            </div>

        </section>
        <c:import url="_PIED.jsp" />

    </body>
</html>
