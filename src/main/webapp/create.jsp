<%--
  Created by IntelliJ IDEA.
  User: maxil
  Date: 07.03.2023
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create report</title>
</head>
<body>
<h3>New report</h3>
<form method="post">
    <label>Pathmaster</label><br>
    <input name="pathmaster"/><br><br>
    <label>Brigade</label><br>
    <input name="brigade"/><br><br>
    <label>Railwayname</label><br>
    <input name="railwayname"/><br><br>
    <label>Sitename</label><br>
    <input name="sitename"/><br><br>
    <label>Datereport</label><br>
    <input name="datereport"/><br><br>
    <label>Textreport</label><br>
    <input name="textreport"/><br><br>
    <input type="submit" value="Save" />
</form>
</body>
</html>