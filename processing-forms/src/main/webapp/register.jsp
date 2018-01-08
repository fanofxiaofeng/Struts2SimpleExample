<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Register</title>
    <s:head/>
</head>
<body>
<h3>Register for a prize by completing this form.</h3>

<s:form action="register">
    <s:textfield name="personBean.firstName" label="First name"/>
    <s:textfield name="personBean.lastName" label="Last name"/>
    <s:textfield name="personBean.email" label="Email"/>
    <s:textfield name="personBean.age" label="Age"/>
    <s:submit/>
</s:form>
<hr/>
<s:url action="register" var="registerLink">
    <s:param name="personBean.firstName">fn</s:param>
    <s:param name="personBean.lastName">ln</s:param>
    <s:param name="personBean.email">e@m</s:param>
    <s:param name="personBean.age">939</s:param>
</s:url>
<p><a href="${registerLink}">注册链接</a> </p>
</body>
</html>