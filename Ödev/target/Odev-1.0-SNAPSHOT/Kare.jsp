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
    <title>Kare</title>
</head>
<body>
<h1>Kare</h1>
<form action="Hesap" method="post">
    Hesaplatma istedğiniz nesne kare mi? <input type="checkbox" name="kare">
    </br>
    Kenar uzununluğunu giriniz <input type="text" name="kare">


    <input type="submit" value="Hesapla" name="kare">
</form>
<form action="Hesap" method="get">
    Daha önce hesapladığınız Kareleri listeyin:
    <input type="submit" value="Listele">
</form>


</body>
</html>
