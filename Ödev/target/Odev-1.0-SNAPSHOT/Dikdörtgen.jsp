<%--
  Created by IntelliJ IDEA.
  User: fb_cn
  Date: 28.02.2021
  Time: 00:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dikdörtgen</title>
</head>
<body>
<h1>Dikdörtgen</h1>

<form action="HesapD" method="post">
    1. Kenar uzununluğunu giriniz: <input type="text" name="d1">
    </br>
    2. Kenar uzununluğunu giriniz: <input type="text" name="d2">

    <input type="submit" value="Hesapla">

</form>
<form action="HesapD" method="get">
    Daha önce hesapladığınız dikörtgenleri listeyin:
    <input type="submit" value="Listele">
</form>
</body>
</html>
