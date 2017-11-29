<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <s:head/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Struts 2 Form Tags - Edit Person</title>
    <style type="text/css">
        .label {color:blue; font-style:normal; font-weight:bold}
    </style>
</head>
<body>
<h1>Update Information</h1>

<p>Query test</p>

<s:form action="doQuery" method="post" theme="xhtml">
    <%--<s:textfield key="personBean.firstName"/>--%>
    <%--<s:textfield key="personBean.lastName"/>--%>
    <s:select key="queryResult.name" list="countries"/>
    <%--<s:radio key="personBean.gender" list="genders" />--%>
    <%--<s:select key="personBean.residency" list="states" listKey="stateAbbr" listValue="stateName" />--%>
    <%--<s:checkbox key="personBean.over21" />--%>
    <s:submit key="submit"/>
</s:form>
</body>
</html>