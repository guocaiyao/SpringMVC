<%--
  Created by IntelliJ IDEA.
  User: gyao
  Date: 5/2/19
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="/WEB-INF/mytags.tld" prefix="easy"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Testing SelectElementFormatterTag</title>
</head>
<body>
<easy:select>
    <option value="${value}">${text}</option>
</easy:select>
</body>
</html>
