<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/2/3
  Time: 下午6:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 入门总结</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<h1>查看属性的值</h1>
<%
    pageContext.setAttribute("key1", "VALUE ONE");
    request.setAttribute("key2", "VALUE TWO");
    session.setAttribute("key3", "VALUE THREE");
    application.setAttribute("key4", "VALUE FOUR");
%>
<h2>使用 <code>pageContext.findAttribute</code> 来查找属性的值</h2>
<p><code>key1</code>-> <code><%= (String) pageContext.findAttribute("key1")%>
</code>
</p>
<p><code>key2</code>-> <code><%= (String) pageContext.findAttribute("key2")%>
</code>
</p>
<p><code>key3</code>-> <code><%= (String) pageContext.findAttribute("key3")%>
</code>
</p>
<p><code>key4</code>-> <code><%= (String) pageContext.findAttribute("key4")%>
</code>
</p>
<p><code>key5</code>-> <code><%= (String) pageContext.findAttribute("key5")%>
</code>
</p>

<h2>使用 <code>EL</code> 表达式来查找属性的值 </h2>
<p><code>key1</code>-> <code>${key1}
</code>
</p>
<p><code>key2</code>-> <code>${key2}
</code>
</p>
<p><code>key3</code>-> <code>${key3}
</code>
</p>
<p><code>key4</code>-> <code>${key4}
</code>
</p>
<p><code>key5</code>-> <code>${key5}
</code>
</p>
<%
    session.setAttribute("k1", "天山童姥");
    pageContext.setAttribute("name", "天山童姥", PageContext.SESSION_SCOPE);
%>
<p>${name}</p>
<hr/>
<h1>下面的文字是通过 <code>include</code> <code>naive.jspf</code> 导入的</h1>
<%@ include file="naive.jspf" %>
</body>
</html>
