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
<s:form action="hello">
    <s:textfield name="userName" label="Your name"/>
    <s:submit value="Submit"/>
</s:form>
<s:url action="hello" var="helloLink">
    <s:param name="userName">金子的测试</s:param>
</s:url>
<p><a href="${helloLink}">你好, 金子</a></p>
<s:url action="registerWithInput" var="registerWithInputLink"/>
<p><a href="${registerWithInputLink}">Please register</a> for our prize drawing.(Register with input)</p>
<s:url action="registerWithInput" var="registerWithInputLinkIn_zh_CN">
    <s:param name="request_locale">zh_CN</s:param>
</s:url>
<p><a href="${registerWithInputLinkIn_zh_CN}">请注册</a> for our prize drawing.(Register with input)</p>
<s:url action="registerWithInput" var="registerWithInputLinkIn_zh_TW">
    <s:param name="request_locale">zh_TW</s:param>
</s:url>
<p><a href="${registerWithInputLinkIn_zh_TW}">請註冊</a> for our prize drawing.(Register with input)</p>
<s:url action="edit" var="edit"/>
<p><a href="${edit}">edit</a></p>
<hr/>
<s:url action="query" var="query"/>
<p><a href="${query}">A query test.</a></p>
</body>
</html>