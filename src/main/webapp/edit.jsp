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
    <title>Редактирование отчёта</title>
     <link href="edit.css" rel="stylesheet" type="text/css" media="all">
</head>
<body>
<div class  = "navbar">
  <a href="#" class = "active">Редактировать отчёт</a>
  <a href="/KomIS_war_exploded/index">Главная страница</a>
  </div>
  <div class = "menu">
<form method="post">
  <div class = "row">
    <input type="hidden" value="${report.id_report}" name="id_report" /> 
  </div>
   <div class = "row"> 
     <div class = "col-25">
          <label>Дорожный мастер</label>
  </div>
   <div class = "col-75"> <input name="pathmaster" value="${report.pathmaster}" />
     </div>
  </div>
  
  <div class = "row">
    <div class = "col-25">
    <label>Бригада</label>
  </div>
    <div class = "col-75"><input name="brigade" value="${report.brigade}" />
  </div>
  </div>
  <div class = "row">
  <div class = "col-25">
    <label>Наименование Ж/Д</label>
    </div>
     <div class = "col-75">
       <input name="railwayname" value="${report.railwayname}" />
  </div>
  </div>
  <div class = "row">
  <div class = "col-25"> 
    <label>Номер участка</label>
    </div>
    <div class = "col-75">
      <input name="sitename" value="${report.sitename}" />
  </div>
  </div>
  <div class = "row">
  <div class = "col-25">
    <label>Дата отчёта</label>
    </div>
     <div class = "col-75">
       <input name="datereport" value="${report.datereport}" />
  </div>
  </div>
  <div class = "row">
  <div class = "col-25">
    <label>Текст отчёта</label>
    </div>
    <div class = "col-75"> <input name="textreport" value="${report.textreport}" />
  </div>
  </div>
    <input id="button" type="submit" value="Сохранить" />
</form>
  </div>
</body>
</html>
