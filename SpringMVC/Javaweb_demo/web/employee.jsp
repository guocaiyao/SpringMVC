<%--
  Created by IntelliJ IDEA.
  User: gyao
  Date: 5/1/19
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>
</head>
<body>
accept-language: ${header['accept-language']}
<br/>
session id: ${pageContext.session.id}
<br/>
employee: ${requestScope.employee.name}, ${employee.address.city},${employee.address.zipCode}
<br/>
capital: ${capitals["Canada"]},${capitals["China"]}
</body>
</html>
