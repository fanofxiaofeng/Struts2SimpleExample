<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Registration Successful</title>
</head>
<body>
<h3>Thank you for registering for a prize.</h3>

<p>Your registration information: <s:property value="personBean"/></p>

<p><a href="<s:url action='index' />">Return to home page</a>.</p>
<h3><s:text name="thankyou"/></h3>
<h3><s:text name="greeting"/></h3>
<s:if test="personBean.over21">
    <p>够大了</p>
</s:if>
<s:else>
    <p>还不行</p>
</s:else>
</body>
</html>

