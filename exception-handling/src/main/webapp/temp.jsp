<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>temp.jsp 哦</title>
</head>
<body>
<h4>view is temp.jsp</h4>

<p> Please contact technical support with the following information:</p>

<h4>Exception Name: <s:property value="exception"/></h4>
<h4>Exception Details: <s:property value="exceptionStack"/></h4>

<p><a href="index.jsp">Return to the home page.</a></p>
</body>
</html>
