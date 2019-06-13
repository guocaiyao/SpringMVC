<%--
  Created by IntelliJ IDEA.
  User: gyao
  Date: 5/7/19
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>View Product</title>
    <style type="text/css">@import url("<c:url value="/statics/css/mian.css"/>");</style>
</head>
<body>
<div id="global">
    <h4>${message}</h4>
    <p>
    <h5>Details:</h5>
    Product Name: ${product.name}<br/>
    Description: ${product.description}<br/>
    Price: $${product.price}
    </p>
</div>
</body>
</html>
