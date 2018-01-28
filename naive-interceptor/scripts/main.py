#!/usr/local/bin/python3
# encoding=utf-8

import os
import requests
import pprint


def get_module_name():
    # the result of pwd will be shown as '/sth/sth/sth/${module_name}/script'
    # so by using awk, we can fetch the name of the module
    command = '''pwd | awk -F '/' '{print $(NF-1)}' '''
    result = os.popen(command)
    return result.read().strip()


module_name = get_module_name()
template = 'http://localhost:8080/%s/%%s.action' % module_name
url_for_index_action = template % 'index'
url_for_date_action = template % 'date'

response = requests.get(url_for_index_action)
print(' index.action 的响应如下 '.center(80, '='))
pprint.pprint(response.text)

print(' date.action 的响应如下 '.center(80, '='))
response = requests.get(url_for_date_action)
pprint.pprint(response.text)


