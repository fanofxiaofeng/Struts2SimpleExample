#!/usr/local/bin/python3
#-*- encoding=utf8 -*-

import os

def get_module_name():
    # 可以参考 https://www.cnblogs.com/wind-wang/p/5822192.html
    file_name_with_real_path = os.path.realpath(__file__)
    # e.g. /Users/jinyang/Desktop/study/Java/struts/Struts2SimpleExample/hello-world/scripts/main.py

    parent_folder_name_with_real_path = os.path.dirname(file_name_with_real_path)
    # e.g. /Users/jinyang/Desktop/study/Java/struts/Struts2SimpleExample/hello-world/scripts

    ans = os.path.basename(os.path.dirname(parent_folder_name_with_real_path))
    # e.g. hello-world
    return ans

def get_action_name():
    file_name_with_real_path = os.path.realpath(__file__)
    file_name = os.path.basename(file_name_with_real_path)
    # 可以参考 https://www.cnblogs.com/renpingsheng/p/7065565.html#19
    file_name_without_extension = os.path.splitext(file_name)[0]

    ans = file_name_without_extension
    return ans

module_name = get_module_name()
action_name = get_action_name()
url = 'http://localhost:8080/%s/%s.action' % (module_name, action_name)
os.system('open %s' % url)
