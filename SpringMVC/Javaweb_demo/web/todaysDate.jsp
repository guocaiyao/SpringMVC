<%--
  Created by IntelliJ IDEA.
  User: gyao
  Date: 4/30/19
  Time: 6:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<html>
<head>
    <title>Today's date</title>
</head>
<body>
<%
    DateFormat dateFormat =
            DateFormat.getDateInstance(DateFormat.LONG);
    String s = dateFormat.format(new Date());
    out.println("Today is " + s);
    out.println("<br>"+"Today is "+dateFormat);
%>
</body>
</html>
