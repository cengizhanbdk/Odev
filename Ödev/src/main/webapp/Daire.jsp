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
    <title>Title</title>
</head>
<body>

<form action="HesapDaire" method="post">
    Yarıçap uzununluğunu giriniz: <input type="text" name="daire">

    <input type="submit" value="Hesapla">
</form>
<form action="HesapDaire " method="get">
    Daha önce hesapladığınız daireleri listeyin:
    <input type="submit" value="Listele">
</form>
</body>
</html>
