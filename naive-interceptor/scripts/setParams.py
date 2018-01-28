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
action = 'http://localhost:8080/%s/paramsCanBeSet.action?something=汉字比较容易被看到' % module_name

response = requests.get(action)
print('url: %s' % response.url)
print(' action 的响应如下 '.center(80, '='))
pprint.pprint(response.text)
action = 'http://localhost:8080/%s/paramsCanNotBeSet.action?something=doggy' % module_name
response = requests.get(action)
print('url: %s' % response.url)
print(' action 的响应如下 '.center(80, '='))
pprint.pprint(response.text)



