#!/usr/local/bin/python3
#-*- encoding=utf8 -*-

import requests
import sys

# usage:
# ./action.py hello

module_name = 'using-tags'
action_name = sys.argv[1]
url = 'http://localhost:8080/%s/%s.action' % (module_name, action_name)
response = requests.get(url)
print(response.text)
