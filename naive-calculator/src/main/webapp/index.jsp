<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>naive 计算器</title>
    <s:head/>
</head>
<body>
<s:form action="calculate">
    <s:textfield name="firstOperator" label="第一个操作数"/>
    <s:select name="operation" list="{'+', '-', '*', '/'}"/>
    <s:textfield name="secondOperator" label="第二个操作数"/>
    <s:submit name="进行计算"/>
</s:form>
</body>
</html>