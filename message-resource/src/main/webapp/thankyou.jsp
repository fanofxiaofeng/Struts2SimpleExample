<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Registration Successful</title>
</head>
<body>
<h3><s:text name="thankyou"/></h3>

<p><s:text name="show"/> <s:property value="personBean"/></p>

<p><a href="<s:url action='index' />"><s:text name="guide"/></a></p>
</body>
</html>
