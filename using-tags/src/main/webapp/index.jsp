<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="标签库" uri="/struts-tags" %>
<%@ taglib prefix="h" uri="/WEB-INF/hello.tld" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>
<p><a href="<标签库:url action='hello'/>">点击这里会触发 hello.action</a></p>
<hr/>
<标签库:url action="hello" var="问候的链接">
    <标签库:param name="userName">布鲁斯 菲利普斯</标签库:param>
</标签库:url>

<p><a href="${问候的链接}">你好 布鲁斯 菲利普斯</a></p>

<hr/>
<标签库:form action="hello">
    <标签库:textfield name="userName" label="Your name"/>
    <标签库:submit value="Submit"/>
</标签库:form>

<%-- 下面的部分可以略过 --%>
<h:Hello/>
</body>
</html>