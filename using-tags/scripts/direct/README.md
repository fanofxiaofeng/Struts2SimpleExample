本路径下的各个 python 文件执行时不会打开浏览器

如何在本目录下执行本目录下的各个脚本
1. `./action.py 'index'` 可以触发 `index.action`
2. `./action.py 'hello'` 可以触发 `hello.action`
3. `./hello_action_with_get_method.py '天山童姥'` 可以触发 `hello.action`(并以 `天山童姥` 作为 `get` 请求中 `userName` 的值)
4. `./hello_action_with_post_method.py '天山童姥'` 可以触发 `hello.action`(并以 `天山童姥` 作为 `post` 请求中 `userName` 的值)
