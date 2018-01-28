<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/2/4
  Time: 下午7:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <%-- message 里保存汉字还是有问题 --%>
    <%
        String message = "Hello doggy";
        response.sendError(404, message);
    %>
</p>
</body>
</html>
