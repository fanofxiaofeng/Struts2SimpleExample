<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>update your information</title>
    <s:head/>
</head>
<body>
<s:property value="id"/>
<s:form action="createPerson">
    <s:textfield name="person.firstName" label="first name"/>
    <s:textfield name="person.lastName" label="last name"/>
    <s:submit value="提交"/>
</s:form>
</body>

</html>
