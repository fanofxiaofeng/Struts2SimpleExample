<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Tags</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>
<s:url action="edit" var="editLink"/>
<p><a href="${editLink}">Update Information</a></p>
</body>
</html>