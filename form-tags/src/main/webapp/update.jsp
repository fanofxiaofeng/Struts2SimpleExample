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

<s:form action="save">
    <s:textfield key="personBean.firstName"/>
    <s:textfield key="personBean.lastName"/>
    <s:textfield key="personBean.email"/>
    <s:textfield key="personBean.phoneNumber"/>
    <s:select key="personBean.sport" list="sports"/>
    <s:radio key="personBean.gender" list="genders"/>
    <s:select key="personBean.residency" list="states" listKey="stateAbbr" listValue="stateName"/>
    <s:checkbox key="personBean.over21"/>
    <s:checkboxlist key="personBean.carModels" list="carModelsAvailable"/>
    <s:submit key="sumbit"/>
</s:form>
<hr/>
<p><s:text name="contact"/></p>
<hr/>
<p><s:text name="greeting"/></p>
</body>
</html>