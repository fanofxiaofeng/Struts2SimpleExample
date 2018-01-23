<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>update your information</title>
    <link type="text/css" href="css/simple.css" rel="stylesheet">
    <s:head/>
</head>
<body>

<s:if test="personList.size > 0">
    <table class="show">
        <tr>
            <th>id</th>
            <th>first name</th>
            <th>last name</th>
            <th>删除</th>
            <th>修改</th>
        </tr>
        <s:iterator value="personList">
            <tr>
                <td><s:property value="id"/></td>
                <td><s:property value="firstName"/></td>
                <td><s:property value="lastName"/></td>
                <s:url action="deletePerson" var="deleteLink">
                    <s:param name="id" value="id"/>
                </s:url>
                <td><a href="${deleteLink}">执行操作</a></td>

                <s:url action="editPerson" var="editLink">
                    <s:param name="id" value="id"/>
                </s:url>
                <td><a href="${editLink}">执行操作</a></td>
            </tr>
        </s:iterator>
    </table>
    <hr/>
</s:if>
<s:url action="create" var="createLink"/>
<p><a href="${createLink}">增</a></p>
<hr/>
<p>
    <s:form action="query">
        <s:textfield name="id" label="要查询的 person 的 id"/>
        <s:submit value="查询"/>
    </s:form>
</p>
</body>
</html>