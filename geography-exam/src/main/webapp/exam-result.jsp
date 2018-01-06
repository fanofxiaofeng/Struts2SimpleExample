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
<h1 class="align-center">考试结果</h1>
<p class="align-center">满分: <s:property value="fullScore"/></p>
<p class="align-center">得分: <s:property value="currentScore"/></p>
</body>
</html>
