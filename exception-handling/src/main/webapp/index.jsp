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

<h2>Simplified Chinese Version(简体字版本)</h2>
<s:url action="registerInput" var="registerInputLink_zh_CN" namespace="config-browser">
    <s:param name="request_locale">zh_CN</s:param>
</s:url>
<p><a href="${registerInputLink_zh_CN}">注册输入</a></p>

</body>
</html>