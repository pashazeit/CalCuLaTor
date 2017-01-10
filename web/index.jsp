<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Zeit
  Date: 10.01.2017
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<html>

<script>
    function changeValue(val) {
        document.getElementById("values").action = val;
    }
</script>

<head>
    <title>Куркулятор</title>
</head>
<body>

<form method="post" id="values" action="">
    <input type="text" name="A" autocomplete="off" title="A"/>
    <input type="text" name="B" autocomplete="off" title="B"/>
    <input type="submit" value="Ввод"/>
</form>

<p>Выберите действо <select onchange="changeValue(this.options[this.selectedIndex].text);">
    <option value=""></option>
    <option>plus</option>
    <option>minus</option>
    <option>multiply</option>
    <option>divide</option>

</select></p>

Итого : ${result}
</body>
</html>
