1. 切换到本模块顶层目录下
2. 执行 `mvn clean jetty:run`
3. 通过浏览器访问 [http://localhost:8080/basic-struts/index.action](http://localhost:8080/basic-struts/index.action) 
或者直接执行 [./scripts/main.py](./scripts/main.py)

由于 `src/main/webapp/WEB-INF/web.xml` 中已经配置了由名为 `struts2` 的过滤器来处理所有的 url pattern,
所以访问 `http://localhost:8080/basic-struts/index.action` 时, `struts2` 过滤器会拦截.
在 `src/main/resources/struts.xml` 中可以找到与 `index.action` 对应的配置.
当 `index.action` 触发时, 应当返回的 view 是 index.jsp 