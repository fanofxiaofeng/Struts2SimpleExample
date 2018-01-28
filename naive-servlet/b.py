#!/usr/local/bin/python3

import requests

response = requests.get('http://localhost:8080/naive-servlet/syntax.jsp')
response.encoding = 'utf-8'
print(response.text)
