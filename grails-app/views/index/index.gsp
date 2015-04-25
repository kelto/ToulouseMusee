<%--
  Created by IntelliJ IDEA.
  User: kelto
  Date: 25/04/15
  Time: 18:55
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Index</title>
</head>

<body>
<h1>favoris</h1>
<g:each in="${favoris}" status="i" var="museeInstance">
    <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

        <td><g:link action="show" id="${museeInstance.id}">${fieldValue(bean: museeInstance, field: "accesBus")}</g:link></td>

        <td>${fieldValue(bean: museeInstance, field: "id")}</td>
        <td>${fieldValue(bean: museeInstance, field: "accesMetro")}</td>

        <td>${fieldValue(bean: museeInstance, field: "gestionnaire")}</td>

        <td>${fieldValue(bean: museeInstance, field: "horairesOuverture")}</td>

        <td>${fieldValue(bean: museeInstance, field: "nom")}</td>

        <td>${fieldValue(bean: museeInstance, field: "telephone")}</td>
        <td>
%{--
<a href="${createLink( controller:'index', action:'removeFromFavorites', params: [id: museeInstance.id])}">remove </a>
--}%
   <g:link action="removeFromFavorites" params="[id: museeInstance.id, name: museeInstance.nom]">Remove</g:link>

</td> <br/>

</tr>
</g:each>
</body>
</html>