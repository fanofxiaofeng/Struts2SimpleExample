<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="标签库" uri="/struts-tags" %>
<html>
<head>
    <title>有异常抛出</title>
</head>
<body>
<p>Please contact technical support with the following information:</p>
<h4>Exception Name: <标签库:property value="exception"/></h4>
<h4>Exception Details: <标签库:property value="exceptionStack"/></h4>
</body>
</html>
