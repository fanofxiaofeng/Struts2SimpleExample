<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/1/31
  Time: 下午9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, table th, table td {
            border: 5px groove lightblue;
            border-collapse: collapse;
        }

        th {
            background-color: darkgray;
        }

        td {
            background-color: black;
            color: darkorange;
        }

        table caption {
            background-color: lightblue;
        }
    </style>
</head>
<body>
<p>普通文档</p>
<c:out value="new Date();"/>
<p>${cookie["naive_counter"].value}</p>
<p>${2 * 3 * 4 * 5 * 6}</p>
<p>${fn:length("Get the length of me.")}</p>
<table>
    <caption>获取 request 里 header 的一些属性</caption>
    <thead>
    <tr>
        <th>name</th>
        <th>value</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Accept</td>
        <td>${header["Accept"]}</td>
    </tr>
    <tr>
        <td>Accept-Encoding</td>
        <td>${header["Accept-Encoding"]}</td>
    </tr>
    <tr>
        <td>Accept-Language</td>
        <td>${header["Accept-Language"]}</td>
    </tr>
    <tr>
        <td>Cookie</td>
        <td>${header["Cookie"]}</td>
    </tr>
    </tbody>
</table>
<p>
    <c:if test="${1 == 1}">
        <span>abc</span>
    </c:if>
</p>
<p><c:out value="&lt 2018 &gt" escapeXml="true"/></p>
<p><c:out value="&lt 2018 &gt" escapeXml="false"/></p>
<p><c:out value="${null}" default="默认值"/></p>

</body>
</html>
