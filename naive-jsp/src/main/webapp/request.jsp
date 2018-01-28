<%@ page import="java.util.Enumeration" %>
<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/2/4
  Time: 下午7:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<p>request.getRequestURI(): <code><%= request.getRequestURI()%>
</code></p>
<hr/>

<p>request.getServerPort(): <code><%= request.getServerPort()%>
</code></p>
<hr/>

<p>request.getRequestedSessionId(): <code><%= request.getRequestedSessionId()%>
</code></p>
<hr/>

<p>
    cookie 的内容:
    <%-- 遍历 cookie 并展示 --%>
    <code><% Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String content = String.format("[%s] -> [%s]", cookie.getName(), cookie.getValue());
                out.print(content);
            }
        } %>
    </code>
</p>
<hr/>

<table border="5px">
    <caption>request header 的内容</caption>
    <tr>
        <th>name</th>
        <th>value</th>
    </tr>
    <%
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = (String) headerNames.nextElement();
            String value = request.getHeader(name);
    %>
    <tr>
        <td><%=name%>
        </td>
        <td><%=value%>
        </td>
    </tr>
    <%
        }
    %>
</table>

<hr/>
<p>request.getMethod(): <code><%= request.getMethod() %>
</code>
</p>
<hr/>

<p>request.getProtocol(): <code><%=request.getProtocol()%>
</code></p>
<hr/>
<p>本文主要参考了以下链接</p>
<ul>
    <li><a href="https://www.tutorialspoint.com/jsp/jsp_client_request.htm" target="_blank">JSP - Client Request</a></li>
    <li><a href="http://www.cnblogs.com/xdp-gacl/p/3776512.html" target="_blank">javaweb学习总结(十五)——JSP基础语法</a></li>
</ul>
</body>
</html>
