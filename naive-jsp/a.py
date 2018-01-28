#!/usr/local/bin/python3
# encoding=utf-8

directive = '<%@ page contentType="text/html;charset=UTF-8" language="java" %>\n'

text_for_header = '<h1>%s</h1>\n'

text_for_get_class = '<p>%s.getClass(): <code><%%= %s.getClass() %%> </code></p>\n'

text_for_comparison = '<p>%s == pageContext.%s?: <code><%%= %s == pageContext.%s %%> </code></p>\n'


def find_corresponding_method(obj):
    if obj == 'pageContext':
        return None
    if obj == 'config':
        return 'getServletConfig()'
    if obj == 'application':
        return 'getServletContext()'
    return 'get%s()' % obj.capitalize()


# 9 个隐藏对象中有 8 个写在了下面(只有 Exception 没有列出来)
objects = ['request', 'response', 'out', 'session', 'application', 'config', 'pageContext', 'page']
jsp_file = open('src/main/webapp/bodyContentForImplicitObjects.jspf', 'w')
jsp_file.write(directive)
for object in objects:
    jsp_file.write(text_for_header % object)
    jsp_file.write(text_for_get_class % (object, object))
    method = find_corresponding_method(object)
    if method:
        jsp_file.write(text_for_comparison % (object, method, object, method))
    jsp_file.write("<hr/>\n")

jsp_file.close()
