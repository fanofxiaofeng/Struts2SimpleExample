<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
    <style>
        .align-center {
            text-align: center;
        }
    </style>
</head>
<body>
<h1 class="align-center">欢迎参加地理考试</h1>
<p><a href="<s:url action='hello'/>">Hello World</a></p>
<s:url action="hello" var="helloLink">
    <s:param name="userName">sed awk</s:param>
</s:url>
<p><a href="${helloLink}">试试效果</a></p>
<p>试试用自己的名字产生一个表单</p>
<s:form action="dog">
    <s:textfield name="abc"/>
    <s:submit/>
</s:form>
</body>
</html>