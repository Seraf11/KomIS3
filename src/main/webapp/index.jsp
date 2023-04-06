<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Report</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link href="report.css" rel="stylesheet" type="text/css" media="all">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
  
  <div class="navbar">
      <a href="#" class="active">Отчёт</a>
    </div>
<div class="box">
<table class = "table table-striped table-bordered ">
  <thead>
    <tr>
	    <th>Мастер путей</th>
	    <th>Бригада</th>
	    <th>Наименование ж/д</th>
        <th>Участок</th>
		<th>Дата отчёта</th>
		<th>Текст отчёта</th>
		<th> </th>
	</tr>
  </thead>
    <c:forEach var="report" items="${report}">
        <tr><td>${report.pathmaster}</td>
            <td>${report.brigade}</td>
            <td>${report.railwayname}</td>
            <td>${report.sitename}</td>
            <td>${report.datereport}</td>
            <td>${report.textreport}</td>
            <td>
                <button id="button"><a class="clr" href='<c:url value="/edit?id_report=${report.id_report}" />'>Редактировать</a> </button>
                <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                <input type="hidden" name="id_report" value="${report.id_report}">
                <input id="button" type="submit" value="Удалить">
             </form> </td>

            </tr>

    </c:forEach>
</table>
  </div>
  <div><button class="button"><a class="clr" href="/KomIS_war_exploded/create">Создать</a></button></div>
</body>
</html>