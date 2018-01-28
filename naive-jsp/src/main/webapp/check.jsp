<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/2/3
  Time: 下午7:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<h1>使用 <code>pageContext.findAttribute</code> 来查找属性的值</h1>

<p><code>key1</code> -> <code><%= (String) pageContext.findAttribute("key1")%>
</code>
</p>
<p><code>key2</code> -> <code><%= (String) pageContext.findAttribute("key2")%>
</code>
</p>
<p><code>key3</code> -> <code><%= (String) pageContext.findAttribute("key3")%>
</code>
</p>
<p><code>key4</code> -> <code><%= (String) pageContext.findAttribute("key4")%>
</code>
</p>
<p><code>key5</code> -> <code><%= (String) pageContext.findAttribute("key5")%>
</code>
</p>
<hr/>
<p>
    如果先访问 <code>simple.jsp</code> 再访问 <code>check.jsp</code> 的话,
    则可以看到 <code>key3</code> 和 <code>key4</code> 对应的值(因为它们分别是 <code>session</code> 和 <code>application</code> 范围的).
    如果服务启动后直接访问 <code>check.jsp</code>, 则只能看到 <code>key4</code> 对应的值.
</p>
</body>
</html>
