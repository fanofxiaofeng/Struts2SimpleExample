#!/usr/local/bin/python3
#-*- encoding=utf8 -*-

import requests
import sys

# usage:
# ./hello_action_with_get_method.py someone

module_name = 'using-tags'
action_name = 'hello'
url = 'http://localhost:8080/%s/%s.action' % (module_name, action_name)
response = requests.get(url, {'userName': sys.argv[1]})
print(response.text)
