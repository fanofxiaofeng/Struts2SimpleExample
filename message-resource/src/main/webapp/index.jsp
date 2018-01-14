<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Message Resource Files</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>

<hr/>
<h2>English Version</h2>
<s:url action="registerInput" var="registerInputLink">
    <s:param name="request_locale">en</s:param>
</s:url>
<p><a href="${registerInputLink}">Please register</a></p>

<hr/>
<h2>Simplified Chinese Version(简体字版本)</h2>
<s:url action="registerInput" var="registerInputLink_zh_CN">
    <s:param name="request_locale">zh_CN</s:param>
</s:url>
<p><a href="${registerInputLink_zh_CN}">请注册</a></p>

<hr/>
<h2>Traditional Chinese Version(正體字版本)</h2>
<s:url action="registerInput" var="registerInputLink_zh_HK">
    <s:param name="request_locale">zh_HK</s:param>
</s:url>
<p><a href="${registerInputLink_zh_HK}">請註冊</a></p>

</body>
</html>