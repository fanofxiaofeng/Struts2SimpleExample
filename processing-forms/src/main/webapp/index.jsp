<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<%-- 第一种方式是先跳转到 register.jsp 页面, 填写好表单后用 post 请求方式触发 register.action --%>
<p><a href="register.jsp">Please register</a> for our prize drawing.</p>
<hr/>
<%-- 第二种方式是直接使用填写好的参数, 用 get 请求的方式触发 register.action --%>
<s:url action="register" var="registerLink">
    <s:param name="personBean.firstName">琼恩</s:param>
    <s:param name="personBean.lastName">雪诺</s:param>
    <s:param name="personBean.email">JonSnow@HBO.com</s:param>
    <s:param name="personBean.age">100</s:param>
</s:url>
<p><a href="${registerLink}">使用 get 请求触发 register.action (参数已经填写好)</a></p>
</body>
</html>