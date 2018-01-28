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

cookies = {}
def show_response(url):
    global cookies
    response = requests.get(url, cookies)
    if cookies:
        print(' index.action 的响应(发送请求时有cookie)如下 '.center(80))
    else:
        print(' index.action 的响应(发送请求时无cookie)如下 '.center(80))
    cookies = dict(response.cookies)
    pprint.pprint(response.text)


module_name = get_module_name()
template = 'http://localhost:8080/%s/%%s.action' % module_name
url_for_index_action = template % 'index'

show_response(url_for_index_action)

for i in range(2):
    if 'JSESSIONID' in cookies:
        print(cookies['JSESSIONID'])
        show_response(url_for_index_action)
    time.sleep(1)


