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
<g:form id="seeVisite" url="[action: 'seeVisite']">
    <label>Code visite: </label>
    <g:textField name="code"/><br/>
    <g:actionSubmit value="chercher visite" action="seeVisite"/>
</g:form>

<g:form id="visite" url="[controller: 'visite', action: 'visite']">
    <g:each in="${favoris}" status="i" var="musee">
        %{-- ca bug ici si y a rien dans la session --}%
    <g:checkBox name="museeId" value="${musee.id}"/>${musee.nom}<br/>
    </g:each>
    <g:datePicker name="debut" value="${new Date()}" precision="day" relativeYears="[0..1]"></g:datePicker><br/>
    <g:datePicker name="fin" value="${new Date()}" precision="day" relativeYears="[0..1]"></g:datePicker><br/>
    <g:field type="number" name="nb" min="1" max="6" required="true" value="1"/>
    <g:actionSubmit value="Demander Visite" action="visite"/>
</g:form>
</body>
</html>