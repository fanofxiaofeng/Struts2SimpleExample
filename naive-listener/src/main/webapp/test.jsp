<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/2/11
  Time: 上午11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    private final static String ADD = "add";
    private final static String DELETE = "delete";
    private final static String REPLACE = "replace";
    private final static String ATTRIBUTE_NAME = "someStuff";
%>
<%
    String choice = request.getParameter("choice");
%>
<p>
    choice is:  <%= choice%>
    <%
        if (ADD.equals(choice)) {
            application.setAttribute(ATTRIBUTE_NAME, "some value");
        } else if (DELETE.equals(choice)) {
            application.removeAttribute(ATTRIBUTE_NAME);
        } else if (REPLACE.equals(choice)) {
            application.setAttribute(ATTRIBUTE_NAME, "old value");
            application.setAttribute(ATTRIBUTE_NAME, "new value");
        }
    %>
</p>
<p>value of the attribute: <%= application.getAttribute(ATTRIBUTE_NAME)%>
</p>
</body>
</html>
