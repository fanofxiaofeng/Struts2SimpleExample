<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/2/4
  Time: 下午3:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<h1>The Scriptlet</h1>
<p>

    <%
        out.print("The contextPath of this request is: ");
    %>
    <code><% out.print(request.getContextPath());%>
    </code>
</p>
<p>
    <%
        out.print("The method of this request is: ");
    %>
    <code>
        <% out.print(request.getMethod());%>
    </code>
</p>
<hr/>
<h1>JSP Declarations</h1>
<%!
    private final static String s = "s 会成为一个(静态)数据成员";
%>
<p>
    <% out.print("The value of String s is: "); %>
    <code><% out.print(s); %></code>
</p>
<hr/>
<h1>JSP Expression</h1>
<p>下面是一个展示阶乘值的例子</p>
<%
    final int bound = 10;
    Map<Integer, Integer> map = new HashMap<>();
    int product = 1;
    for (int factor = 1; factor <= bound; factor++) {
        product *= factor;
        map.put(factor, product);
    }
%>
<table>
    <thead>
    <tr>
        <th>number</th>
        <th>factorial</th>
    </tr>
    </thead>
    <tbody>
    <%
        for (int i = 1; i <= bound; i++) {
            out.print("<tr>");
            out.print("<td>");
            out.print(i);
            out.print("</td>");
            out.print("<td>");
            out.print(map.get(i));
            out.print("</td>");
            out.print("</tr>");
        }
    %>
    </tbody>
</table>
<hr/>
<h1>JSP Comments</h1>
<ol>
    <li>
        <code>
            <%
                out.print("&lt;%-- This is a JSP comment --%&gt;");
            %>
        </code>
    </li>
    <li>
        <code>
            <%
                out.print("&lt;!-- This is an html comment -->");
            %>
        </code>
    </li>
</ol>
<hr/>
<p>本文主要参考了以下链接</p>
<ul>
    <li><a href="https://www.tutorialspoint.com/jsp/jsp_syntax.htm" target="_blank">JSP - Syntax</a></li>
    <li><a href="http://www.cnblogs.com/xdp-gacl/p/3776512.html" target="_blank">javaweb学习总结(十五)——JSP基础语法</a></li>
</ul>
</body>
</html>
