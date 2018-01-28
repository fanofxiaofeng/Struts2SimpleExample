<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/2/3
  Time: 下午8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="person" class="com.jyjz.playground.model.NaivePerson"/>
<jsp:setProperty name="person" property="name" value="${param[\"name\"]}"/>
<jsp:setProperty name="person" property="age" value="50"/>

<p>${person}</p>
</body>
</html>
