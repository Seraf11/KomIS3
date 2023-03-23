<%--
  Created by IntelliJ IDEA.
  User: maxil
  Date: 07.03.2023
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit report</title>
</head>
<body>
<h3>Edit report</h3>
<form method="post">
    <input type="hidden" value="${report.id_report}" name="id_report" />
    <label>Path master</label><br>
    <input name="pathmaster" value="${report.pathmaster}" /><br><br>
    <label>Brigade</label><br>
    <input name="brigade" value="${report.brigade}" /><br><br>
    <label>Railwayname</label><br>
    <input name="pathmaster" value="${report.railwayname}" /><br><br>
    <label>Sitename</label><br>
    <input name="sitename" value="${report.sitename}" /><br><br>
    <label>Date report</label><br>
    <input name="datereport" value="${report.datereport}" /><br><br>
    <label>Text report</label><br>
    <input name="textreport" value="${report.textreport}" /><br><br>
    <input type="submit" value="Send" />
</form>
</body>
</html>
