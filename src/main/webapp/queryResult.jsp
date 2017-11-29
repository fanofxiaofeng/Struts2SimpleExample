<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <s:head/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Struts 2 Form Tags - Edit Person</title>
</head>
<body>
<h1>查询结果展示</h1>
<p>queryResult: <s:property value="queryResult"/></p>
<p>queryResult.name: <s:property value="queryResult.name"/></p>
<s:set var="prefix" value="'http://flags.fmcdn.net/data/flags/w580/'"/>
<s:set var="postfix" value="'.png'"/>
<s:set var="Test" value="%{#prefix + '' + queryResult.abbr + '' + #postfix}"/>
<a href="${Test}" target="_blank">国旗的链接</a>
<p><s:property value="#Test"/></p>
<img src="${Test}" alt="">
<table border="1">
    <tr>
        <th>缩写</th>
        <th>名称</th>
    </tr>
    <s:iterator value="countries">
        <tr>
            <td><s:property/></td>
            <td><s:property/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
