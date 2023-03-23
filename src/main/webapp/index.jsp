<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Report</title>
</head>
<body>
<h2>Отчёт</h2>
<table>
    <tr><th>Мастер путей</th><th>Бригада</th><th>Наименование ж/д</th><th>Участок</th><th>Дата отчёта</th><th>Текст отчёта</th><th></th></tr>
    <c:forEach var="report" items="${report}">
        <tr><td>${report.pathmaster}</td>
            <td>${report.brigade}</td>
            <td>${report.railwayname}</td>
            <td>${report.sitename}</td>
            <td>${report.datereport}</td>
            <td>${report.textreport}</td>
            <td>
                <a href='<c:url value="/edit?id=${product.id_report}" />'>Edit</a> |
                <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                    <input type="hidden" name="id_report" value="${report.id_report}">
                    <input type="submit" value="Delete">
                    <p><a href="/create">Create new</a></p>
                </form>
            </td></tr>
    </c:forEach>
</table>
</body>
</html>