#!/usr/local/bin/python3
#-*- encoding=utf8 -*-

import os

def get_module_name():
    # 可以参考 https://www.cnblogs.com/wind-wang/p/5822192.html
    file_name_with_real_path = os.path.realpath(__file__)
    # e.g. /Users/jinyang/Desktop/study/Java/struts/Struts2SimpleExample/hello-world/scripts/main.py

    parent_folder_name_with_real_path = os.path.dirname(file_name_with_real_path)
    # e.g. /Users/jinyang/Desktop/study/Java/struts/Struts2SimpleExample/hello-world/scripts

    module_name = os.path.basename(os.path.dirname(parent_folder_name_with_real_path))
    # e.g. using-tags
    return module_name

