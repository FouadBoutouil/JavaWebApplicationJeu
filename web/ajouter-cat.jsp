<%-- 
    Document   : ajouter-cat.jsp
    Created on : 9 juil. 2018, 12:30:52
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style1.css">
    </head>
    <body>

        Bonjour ${cookie.admin.value}
        <div id="cardre">
            
            <h3>  Hello JSP !!! </h3> 

            <form method="post">
                
                <label>Nom</label> 
                <input type="text" name="nom" />
                <input type="submit" />
            </form>
        </div>    
    </body>
</html>
