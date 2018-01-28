import urllib.request
import sys
print(urllib.request.quote("中华"))
file = urllib.request.urlopen("http://localhost:8080/country?code=us")
data = file.read()
open("/Users/jinyang/Desktop/temp.html", "wb").write(data)

sys.exit(0)

a = [
    ("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"),
    ("Accept-Encoding", "gzip, deflate, br"),
    ("Accept-Language", "zh-CN,zh-TW;q=0.8,en-US;q=0.5,en;q=0.3"),
    ("Connection", "close"),
    ("Host", "httpbin.org"),
    ("Upgrade-Insecure-Requests", "1"),
    ("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:56.0) Gecko/20100101 Firefox/56.0")
]

opener = urllib.request.build_opener()
opener.addheaders = a
file = opener.open("https://www.zhihu.com/")
data = file.read()
open("/Users/jinyang/Desktop/temp.html", "wb").write(data)

print("OK")
