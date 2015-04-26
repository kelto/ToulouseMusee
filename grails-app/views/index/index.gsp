<%--
  Created by IntelliJ IDEA.
  User: kelto
  Date: 25/04/15
  Time: 18:55
--%>

<%@ page import="toulousemusee.Adresse" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="pageHeader" value="index" scope="request"/>
    <title>Index</title>
</head>

<body>
<h1>Search</h1>

<div class="col-md-8">
    <g:form id="search" url="[controller: 'index', action: 'search']">
        <div class="control-group form-group">
            <div class="controls">
                <label>Nom: </label>
                <g:textField name="nom" class="form-control"/><br/>
            </div>
            <div class="controls">
                <label>Nom de la rue: </label>
                <g:textField name="rue" class="form-control"/><br/>
            </div>
            <div class="controls">
                <label>Code postal: </label>
                <g:select name="codePostal"
                          from="${toulousemusee.Adresse.list().codePostal.unique()}" class="form-control"/>
            </div>
        </div>
        <g:actionSubmit value="Rechercher" action="search" class="btn btn-primary"/>
    </g:form>

</div>
    <div class="col-md-4">

    <div class="well">
        <h4>Favoris</h4>
        <div class="row">
            <div class="col-lg-6">
                <ul class="list-unstyled">
                <g:each in="${favoris}" status="i" var="museeInstance">
                    <li>
                        <g:link action="removeFromFavorites" id="${museeInstance.id}">${fieldValue(bean: museeInstance, field: "nom")}</g:link>
                    </li>
                </ul>
                </g:each>
            </div>
        </div>
    </div>
</div>
<hr />


<g:each in="${searchList}" status="i" var="musee">
    <div class="col-md-5" style="padding-left: 30px; padding-bottom:30px;">
    <h3 class="text-center">${musee.nom}</h3>
    <p>metro: ${musee.accesMetro} - bus: ${musee.accesBus} - horaire: ${musee.horairesOuverture} <br/>
    tel: ${musee.telephone} </p>
    <g:link class="btn-primary col-md-5 col-md-offset-3" action="addToFavorites" params="[id: musee.id, name: musee.nom]">Like</g:link>
    </div>
</g:each>



</div>
</body>
</html>