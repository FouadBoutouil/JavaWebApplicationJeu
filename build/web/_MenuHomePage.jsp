<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-dark bg-dark">

    <!-- // je dois verifier si la variable session existe-->
    <c:choose>

        <c:when test="${clientConnecte !=null}"  >
            <a href="<c:url value="/MonCompte"/>" > mon Compte</a>
            
            <a href="<c:url value="/DeconecterClient"/>"> DECONECTER</a>
        </c:when>

        <c:when test="${clientConnecte == null}"  > 
            <a href="<c:url value="/ajouterClientServelet"/>" > Inscription</a>
            <a href="<c:url value="/LoginServelet"/>" > LOGIN</a>
        </c:when>
    </c:choose>  
    
    
    <a href="changerStyle?drapeau=jamaique">-JAMAIQUE-</a>
    <a href="changerStyle?drapeau=cuba">-CUBA-</a>

</nav>