<%--
  Created by IntelliJ IDEA.
  User: gyao
  Date: 5/2/19
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="/WEB-INF/mytags.tld" prefix="easy"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Testing DataFormatterTag</title>
</head>
<body>
<easy:dataFormatter header="States"
                    items="Alabama,Alaska,Georgia,Florida"
/>

<br/>
<easy:dataFormatter header="Countries">
    <jsp:attribute name="items">
        US,UK,Canada,Korea
    </jsp:attribute>
</easy:dataFormatter>
</body>
</html>
