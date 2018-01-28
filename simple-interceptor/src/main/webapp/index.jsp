<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<s:url action="hello" var="helloLink">
    <s:param name="userName">sed awk</s:param>
</s:url>
<s:form action="hello">
    <s:textfield name="userName"/>
    <s:submit/>
</s:form>
<p><a href="${helloLink}">试试效果</a></p>

<%-- 这里有点怪, 它对应的 action 真的就是"upload"(而不是"upload.action"), 不知道为何 --%>
<%-- 改成s:form就好了^_^ --%>
<s:form action="upload" method="post" enctype="multipart/form-data">
    <label for="test">请上传文件</label>
    <input type="file" id="test" name="test"/>
    <input type="submit" value="开始上传"/>
</s:form>

</body>
</html>