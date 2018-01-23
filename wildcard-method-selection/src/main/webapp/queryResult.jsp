<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Query Result</title>
    <link type="text/css" href="css/simple.css" rel="stylesheet">
    <s:head/>
</head>
<body>

<s:if test="person.id >= 0">
    <table class="show">
        <tr>
            <th>id</th>
            <td><s:property value="person.id"/></td>
        </tr>
        <tr>
            <th>first name</th>
            <td><s:property value="person.firstName"/></td>
        </tr>
        <tr>
            <th>last name</th>
            <td><s:property value="person.lastName"/></td>
        </tr>
    </table>
</s:if>
<s:else>
    <p>查无此人</p>
</s:else>
<hr/>
<s:url action="view" var="viewLink"/>
<p><a href="${viewLink}">回到检视页面</a></p>

</body>
</html>
