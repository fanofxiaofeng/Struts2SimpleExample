<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="5px">
    <tr>
        <th>描述</th>
        <th>对应的值(yyyy-MM-dd HH:mm:ss 格式)</th>
    </tr>
    <tr>
        <td>当前</td>
        <td><s:property value="currentDateTime.toString(\"yyyy-MM-dd HH:mm:ss\")"/></td>
    </tr>
    <tr>
        <td>一天前</td>
        <td><s:property value="dateTimeOneDayAgo.toString(\"yyyy-MM-dd HH:mm:ss\")"/></td>
    </tr>
    <tr>
        <td>一个月前</td>
        <td><s:property value="dateTimeOneMonthAgo.toString(\"yyyy-MM-dd HH:mm:ss\")"/></td>
    </tr>
    <tr>
        <td>一年前</td>
        <td><s:property value="dateTimeOneYearAgo.toString(\"yyyy-MM-dd HH:mm:ss\")"/></td>
    </tr>
</table>
</body>
</html>
