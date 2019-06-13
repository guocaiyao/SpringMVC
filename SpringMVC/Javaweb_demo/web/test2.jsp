<%--
  Created by IntelliJ IDEA.
  User: gyao
  Date: 5/4/19
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Form Values</title>
</head>
<body>
<table>
    <tr>
        <td>Name:</td>
        <td>
            ${param.name}
            (length:${fn:length(param.name)})
        </td>
    </tr>
    <tr>
        <td>Address:</td>
        <td>
            ${param.address}
            (length:${fn:length(param.address)})
        </td>
    </tr>
</table>
</body>
</html>
