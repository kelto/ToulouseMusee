<%--
  Created by IntelliJ IDEA.
  User: kelto
  Date: 26/04/15
  Time: 02:21
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="pageHeader" value="Visite" scope="request"/>
    <title></title>
</head>
<div class="row">
<div class="col-md-8">
<g:form id="seeVisite" url="[action: 'seeVisite']">
    <label>Code visite: </label>
    <g:textField class="form-control" name="code"/><br/>
    <g:actionSubmit class="btn btn-primary" value="chercher visite" action="seeVisite"/>
</g:form>
    </div>
</div>
<hr class="col-md-12">
<div class="row">
<div class="col-md-8">
<g:form id="visite" url="[controller: 'visite', action: 'visite']">

            <div class="controls" >
    <label>Date de fin</label>
            <g:datePicker class="form-control" name="debut" value="${new Date()}" precision="day" relativeYears="[0..1]"></g:datePicker><br/>
    </div>
    <div class="controls">
        <label>Date de fin</label>
    <g:datePicker class="form-control" name="fin" value="${new Date()}" precision="day" relativeYears="[0..1]"></g:datePicker><br/>
    </div>
    <div class="controls">
        <label>Nombre de personne(1-6)</label>
    <g:field class="form-control" type="number" name="nb" min="1" max="6" required="true" value="1"/>
    </div>

    <hr class="col-md-12">
    <g:each in="${favoris}" status="i" var="musee">
        <div class="controls">
        <g:checkBox  name="museeId" value="${musee.id}"/>${musee.nom}<br/>
        </div>
    </g:each>

    <g:actionSubmit class="btn btn-primary" value="Demander Visite" action="visite"/>
</g:form>
    </div>
</div>
</body>
</html>