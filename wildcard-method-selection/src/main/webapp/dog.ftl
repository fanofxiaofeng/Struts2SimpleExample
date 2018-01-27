<!DOCTYPE html>
<html>
<#include "head.ftl">
<body>
Hello World ${name}
<#if name == "dog">
<p>哈哈哈</p>
<#else >
<p>学习</p>
</#if>

<p>尝试访问变量 awkward: ${awkward!"尴尬"}</p>
<#if fruits?size != 0>
<p>水果的数量为: ${fruits?size} </p>
</#if>
<#list fruits>
<table border="5px">
    <tr>
        <th>水果名称</th>
    </tr>
    <#items as fruit>
        <tr class="${fruit?item_parity}">
            <td>${fruit}</td>
        </tr>
    </#items>
</table>
</#list>
</body>
</html>
