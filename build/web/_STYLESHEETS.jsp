<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="style3.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<c:if test="${cookie.style != null}" >
    <c:if test = "${cookie.style.value == 'jamaique'}">
        <link href="css/jamaique.css" rel="stylesheet" type="text/css"/>
    </c:if>

    <c:if test = "${cookie.style.value == 'cuba'}">
        <link href="css/cuba.css" rel="stylesheet" type="text/css"/>
    </c:if>
</c:if>    