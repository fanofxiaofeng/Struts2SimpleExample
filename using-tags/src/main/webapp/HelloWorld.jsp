<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World!</title>
    <style>
        .text {
            background-color: lightblue;
        }
    </style>
</head>
<body>
<h2><s:property value="messageStore.message"/></h2>
<p>HelloWorldAction 类创建的实例数量为: <span class="text"><s:property value="count"/></span></p>
<p>MessageStore 类的实例执行 toString() 方法的返回值为: <span class="text"><s:property value="messageStore"/></span></p>
<p><s:property value="userName"/></p>
</body>
</html>