#!/usr/local/bin/python3
#-*- encoding=utf8 -*-

import os
import requests

def get_action_name():
    file_name_with_real_path = os.path.realpath(__file__)
    file_name = os.path.basename(file_name_with_real_path)
    # 可以参考 https://www.cnblogs.com/renpingsheng/p/7065565.html#19
    file_name_without_extension = os.path.splitext(file_name)[0]

    ans = file_name_without_extension
    return ans

module_name = 'hello-world'
action_name = get_action_name()
url = 'http://localhost:8080/%s/%s.action' % (module_name, action_name)
response = requests.get(url)
print(response.text)
