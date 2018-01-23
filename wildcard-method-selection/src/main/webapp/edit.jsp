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

<s:property value="person"/>
<s:form action="savePerson">
    <s:hidden name="person.id"/><br/>
    <s:textfield name="person.firstName" label="名"/><br/>
    <s:textfield name="person.lastName" label="姓"/>
    <s:submit value="Save"/>
</s:form>

</body>
</html>
