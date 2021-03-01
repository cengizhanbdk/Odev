<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Universal</title>
</head>
<body>
<h1><%= "Hoşgeldiniz" %>
</h1>
<br/>
<h3> Hesaplatmak istediğiniz şekle tıklayınız </h3>






<form action="Kare.jsp" method="post">
    <input type="submit" value="Kare">
</form>
</br>
<form action="Daire.jsp" method="post">
    <input type="submit" value="Daire">
</form>
</br>
<form action="Dikdörtgen.jsp" method="post">
    <input type="submit" value="Dikdörtgen">
</form>


</body>
</html>