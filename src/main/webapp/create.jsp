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
    <title>Создвать отчёт</title>
    <link href="create.css" rel="stylesheet" type="text/css" media="all">
</head>
  <body>

    <div class="navbar">
      <a href="#" class="active">Новый отчёт</a>
      <a href="/KomIS_war_exploded/index">Главная страница</a>
    </div>
    <form method="post">
    <div class="menu">
      <div class="row"> 
        <div class ="col-25"> <label>Мастер путей</label> </div>
        <div class="col-75"><input name="pathmaster"/></div> 
      </div>
      <div class="row"> 
        <div class ="col-25"> <label>Бригада</label> </div>
        <div class="col-75"><input name="brigade"/></div>
      </div>
      <div class="row"> 
        <div class ="col-25"> <label>Наименование Ж/Д</label></div>
        <div class="col-75"> <input name="railwayname"/></div> 
      </div>
     <div class="row"> 
       <div class ="col-25"> <label>Номер участка</label></div>
       <div class="col-75"> <input name="sitename"/></div>
         
       </div>
      <div class="row"> 
        <div class ="col-25"> <label>Дата отчёта</label></div>
        <div class="col-75"><input name="datereport"/></div> 
      </div>
      <div class="row"> 
        <div class ="col-25"><label>Текст отчёта</label> </div>
        <div class="col-75"><input name="textreport"/></div>
        </div>
       <input id="button" type="submit" value="Сохранить" />
    </div>
        </form>
  </body>
</html>