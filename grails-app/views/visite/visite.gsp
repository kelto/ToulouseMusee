<%--
  Created by IntelliJ IDEA.
  User: kelto
  Date: 26/04/15
  Time: 02:20
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Demande Visite</title>
</head>

<body>
    <g:form url="[controller:'visite',action:'visite']">
        <fieldset style="text-align: center">
            <table>
                <tbody>
                <tr>
                    <td>Date de début :</td>
                    <td><g:datePicker name="debut" value="${session.getAttribute("debut")}"/></td>
                </tr>
                <tr>
                    <td>Date de fin :</td>
                    <td><g:datePicker name="fin" value="${session.getAttribute("fin")}"/></td>
                </tr>
                <tr>
                    <td>Nombre de personnes:</td>
                    <td><g:select name="nb" from="${1..6}"
                                              value="${session.getAttribute("nb")}"/></td>
                </tr>
                </tbody>
            </table>
            <br/><br/><br/>
            <g:submitButton name="Envoyer"/>
        </fieldset>
    </g:form>

</body>
</html>