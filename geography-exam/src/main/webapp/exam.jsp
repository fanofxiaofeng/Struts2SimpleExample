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
<h2 class="align-center">Question</h2>
<p class="align-center"><s:property value="currentQuestion.description"/></p>
<%--<p>正确答案: <s:property value="currentQuestion.correctAnswer"/></p>--%>
<div class="align-center">
    <s:form action="takeExam" method="POST">
        <s:radio key="answer" list="currentQuestion.options"/>
        <s:submit value="submit"/>
    </s:form>
</div>
</body>
</html>
