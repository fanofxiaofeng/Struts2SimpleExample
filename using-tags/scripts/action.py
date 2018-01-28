#!/usr/local/bin/python3
#-*- encoding=utf8 -*-

import os
import sys
import util

# usage:
# ./action.py 'hello'

module_name = util.get_module_name()
action_name = sys.argv[1]
url = 'http://localhost:8080/%s/%s.action' % (module_name, action_name)
os.system('open %s' % url)
