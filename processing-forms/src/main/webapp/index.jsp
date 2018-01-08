<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>
<p><a href="<s:url action='hello'/>">点击这里会触发 hello.action</a></p>
<hr/>
<s:url action="hello" var="helloLink">
    <s:param name="userName">Bruce Phillips</s:param>
</s:url>

<p><a href="${helloLink}">Hello Bruce Phillips</a></p>

<hr/>
<s:form action="hello">
    <s:textfield name="userName" label="Your name"/>
    <s:submit value="Submit"/>
</s:form>
<p><a href="register.jsp">Please register</a> for our prize drawing.</p>
<s:url action="register" var="registerLink">
    <s:param name="personBean.firstName">琼恩</s:param>
    <s:param name="personBean.lastName">雪诺</s:param>
    <s:param name="personBean.email">JonSnow@HBO.com</s:param>
    <s:param name="personBean.age">100</s:param>
</s:url>
<p><a href="${registerLink}">试试效果(琼恩雪诺)</a></p>
</body>
</html>