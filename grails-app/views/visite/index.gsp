<%--
  Created by IntelliJ IDEA.
  User: kelto
  Date: 26/04/15
  Time: 02:21
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>
<body>

<g:form id="visite" url="[controller: 'visite', action: 'visite']">
    <g:each in="${favoris}" status="i" var="musee">
        %{-- ca bug ici si y a rien dans la session --}%
    <g:checkBox name="${musee.nom}" value="${musee.id}"/>${musee.nom}
    </g:each>
    <g:actionSubmit value="Demander Visite" action="visite"/>
</g:form>
</body>
</html>