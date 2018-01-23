<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>wildcard-method-selection</title>
</head>
<body>
<h1>欢迎来到 Struts 2 的世界!</h1>
<s:url action="view" var="viewLink"/>
<p><a href="${viewLink}">检视</a></p>
</body>
</html>