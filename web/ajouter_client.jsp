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
          
        <h1>ajouter client</h1>
        
        <div id="main">
            <form method="post">        
            
                <div class="champs">
              
                    <label>Nom</label>   <input type="text" name="nom" />
                    <label>Prénom</label>   <input type="text" name="prenom" />
                    <label>Adresse</label>   <input type="text" name="adresse" />
                    <label>Numéro de Rue</label>   <input type="number" name="numRue" />
                    <label>Coode postal</label>    <input type="number" name="ZIP" />
                    <label>Pseudo</label>    <input type="text" name="login" />
                    <label>mot de passe </label>    <input type="text" name="pwd" />
                </div>
            
                <div class="envoi_reset">
                    <input id="1" type="submit" value="send Me !!" />

                    <input id="1" type="reset" />
                </div>
            </form>
        </div>
        <c:import url="_PIED.jsp" />
      
    </body>
</html>
