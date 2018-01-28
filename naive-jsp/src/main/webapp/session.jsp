<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/2/5
  Time: 上午9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    HttpSession httpSession = request.getSession(true);
    out.print(httpSession.getId());
%>
</body>
</html>
