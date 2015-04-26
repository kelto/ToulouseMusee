<%--
  Created by IntelliJ IDEA.
  User: kelto
  Date: 26/04/15
  Time: 20:22
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="pageHeader" value="Statut de la Demande" scope="request"/>
    <title>Demande Visite</title>
</head>

<body>
<div class="alert alert-success">
    <strong>Visite n°${demande.code}</strong>
    Status: ${demande.statut}
</div>

</body>
</html>