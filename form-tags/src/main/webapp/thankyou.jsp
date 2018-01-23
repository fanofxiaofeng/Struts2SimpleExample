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
<s:property value="personBean"/>
<hr/>
<s:if test="personBean.over21">
    <p>You are old enough to vote!</p>
</s:if>
<s:else>
    <p>You are NOT old enough to vote.</p>
</s:else>
<hr/>
<s:if test="personBean.carModels.length > 1">
    <p>Car models</p>
</s:if>
<s:else>
    <p>Car model</p>
</s:else>
<hr/>
<table style="margin-left: 15px">
    <s:iterator value="personBean.carModels">
        <tr>
            <td><s:property/></td>
        </tr>
    </s:iterator>
</table>
<hr/>
<table style="margin-left: 15px">
    <s:iterator value="states">
        <tr>
            <td><s:property value="stateAbbr"/></td>
            <td><s:property value="stateName"/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
