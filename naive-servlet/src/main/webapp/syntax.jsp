<%@ page import="com.jyjz.playground.model.PlaceHolder" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Enumeration" %>
<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/1/30
  Time: 下午12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>The Scriptlet</h1>
<h2>打印一个 for 循环</h2>
<p>
    <%
        for (int a = 0; a < 10; a++) {
            out.println(a);
        }
    %>
</p>
<h2>打印 http 请求所使用的 method(例如 get/post)</h2>
<p>
    <%
        out.println("所使用的方法为: " + request.getMethod());
    %>
</p>
<h2>展示端口号</h2>
<%= request.getServerPort() %>
<hr/>
<h1>JSP Declarations</h1>
<%! private final static String CONSTANT = "I have a dream"; %>
<h2>打印一个字符串常量</h2>
<p><%= String.format("字符串常量的值为: [%s]", CONSTANT) %>
</p>
<h2>打印一个自定义类</h2>
<%! private PlaceHolder placeHolder = new PlaceHolder(true, "some stuff for message field"); %>
<p><%= placeHolder.toString() %>
</p>
<h2>打印当前时间</h2>
<p>
    <%= new Date() %>
</p>
<hr/>
<h1>JSP Comments</h1>
<%-- jsp 注释, 会被 jsp 引擎忽略 --%>
<!-- html 注释, 会被浏览器忽略 -->
<p><\%%\>\'\"</p>
<hr/>
<%
    Cookie[] cookies = request.getCookies();
    if (cookies.length > 0) {
%>
<h1>展示 cookie 内容</h1>
<table border="5px">
    <thead>
    <tr>
        <th>name</th>
        <th>value</th>
    </tr>
    </thead>
    <tbody>
    <%
        for (Cookie cookie : cookies) {
            out.print("<tr>");
            out.print("<td>");
            out.print(cookie.getName());
            out.print("</td>");
            out.print("<td>");
            out.print(cookie.getValue());
            out.print("</td>");
            out.print("</tr>");
        }
    %>
    </tbody>
</table>
<%
    }
%>
<%
    response.setIntHeader("Refresh", 15);
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=utf-8");
//    response.sendError(404, "解决中文展示异常的问题");
%>
<%--<%--%>
<%--for (int i = 0x1f600; i < 0x1f610; i++) {--%>
<%--out.write(new String(Integer.toHexString(i)));--%>
<%--out.write("<hr/>");--%>
<%--}--%>
<%--%>--%>
<%
    Enumeration e = request.getHeaderNames();
    if (e.hasMoreElements()) {
%>
<table border="5px">
    <tr>
        <th>key</th>
        <th>value</th>
    </tr>
    <%
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = request.getHeader(key);
    %>
    <tr>
        <td><%= key %>
        </td>
        <td><%= value %>
        </td>
    </tr>
    <%
        }
//        response.setHeader("dog", "pig");
    %>
</table>
<%
    }
%>
<p><%= 1 + 2 + 3 %>
    <%
        out.print("大漠沙如雪");
    %>
</p>
<p>
    <% out.print("\ud83d\ude02汉字"); %>
    <%= 2 * 3 * 4 * 5 * 6 %>
    <%--<%= i * i%>--%>
</p>
</body>
</html>
