<%--
  Created by IntelliJ IDEA.
  User: kelto
  Date: 25/04/15
  Time: 18:55
--%>

<%@ page import="toulousemusee.Adresse" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Index</title>
</head>

<body>
<h1>favoris</h1>
<table>
    <thead>
    <tr>
        <th><g:message code="musee.nom.label" default="nom" /></th>
        <th><g:message code="musee.telephone.label" default="telephone" /></th>
        <th><g:message code="musee.adresse.label" default="adresse" /></th>
        <th><g:message code="musee.accesMetro.label" default="metro" /></th>
        <th><g:message code="musee.accesBus.label" default="bus" /></th>
        <th><g:message code="musee.horairesOuverture.label" default="horaires" /></th>
        <th><g:message code="musee.gestionnaire.label" default="gestionnaire" /></th>
        <th><g:message default="remove" /></th>
    </tr>
    </thead>
    <tbody>
<g:each in="${favoris}" status="i" var="museeInstance">
    <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

        <td><g:link action="show" id="${museeInstance.id}">${fieldValue(bean: museeInstance, field: "nom")}</g:link></td>

        <td>${fieldValue(bean: museeInstance, field: "telephone")}</td>
        %{-- LazyLoading, won't work. But better, no need for gestionnaire
                <td>${fieldValue(bean: museeInstance, field: "gestionnaire")}</td>
--}%
                <td>${fieldValue(bean: museeInstance, field: "accesMetro")}</td>

                <td>${fieldValue(bean: museeInstance, field: "accesBus")}</td>

                <td>${fieldValue(bean: museeInstance, field: "horairesOuverture")}</td>

        <td>
%{--
<a href="${createLink( controller:'index', action:'removeFromFavorites', params: [id: museeInstance.id])}">remove </a>
--}%
   <g:link action="removeFromFavorites" params="[id: museeInstance.id, name: museeInstance.nom]">Remove</g:link>
   <g:link action="demandeVisite" params="[name: museeInstance.nom]">Demande de visite</g:link>

</td>
</tr>
</g:each>
    </tbody>
    </table>
<h1>Search</h1>
    <g:form id="search" url="[controller: 'index', action: 'search']">
        <label>Nom: </label>
        <g:textField name="nom"/><br/>
        <label>Nom de la rue: </label>
        <g:textField name="rue"/><br/>
        <label>Code postal: </label>
        <g:select name="codePostal"
                  from="${toulousemusee.Adresse.list().codePostal.unique()}" />
        <g:actionSubmit value="Rechercher" action="search"/>
    </g:form>
<table>
    <thead>
    <tr>
        <th><g:message code="musee.nom.label" default="nom" /></th>
        <th><g:message code="musee.telephone.label" default="telephone" /></th>
        <th><g:message code="musee.adresse.label" default="adresse" /></th>
        <th><g:message code="musee.accesMetro.label" default="metro" /></th>
        <th><g:message code="musee.accesBus.label" default="bus" /></th>
        <th><g:message code="musee.horairesOuverture.label" default="horaires" /></th>
        <th><g:message code="musee.gestionnaire.label" default="gestionnaire" /></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
<g:each in="${searchList}" status="i" var="museeInstance">
    <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
    <td>${fieldValue(bean: museeInstance, field: "accesMetro")}</td>

    <td>${fieldValue(bean: museeInstance, field: "gestionnaire")}</td>

    <td>${fieldValue(bean: museeInstance, field: "horairesOuverture")}</td>

    <td>${fieldValue(bean: museeInstance, field: "nom")}</td>

    <td>${fieldValue(bean: museeInstance, field: "telephone")}</td>
    </tbody>
    </g:each>
    </table>
</body>
</html>