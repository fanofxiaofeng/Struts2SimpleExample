#!/usr/local/bin/python3
# encoding=utf-8

import os
import requests
import pprint
import time


def get_module_name():
    # the result of pwd will be shown as '/sth/sth/sth/${module_name}/script'
    # so by using awk, we can fetch the name of the module
    command = '''pwd | awk -F '/' '{print $(NF-1)}' '''
    result = os.popen(command)
    return result.read().strip()

def show_response(url):
    response = requests.get(url)
    print(' action 的响应如下 '.center(80))
    pprint.pprint(response.text)


module_name = get_module_name()
template = 'http://localhost:8080/%s/%%s.action?choice=%%s' % module_name
for choice in ['add', 'delete', 'replace']:
    url_for_action = template % ('test', choice)
    show_response(url_for_action)
    time.sleep(1)
