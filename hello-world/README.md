1. 切换到本模块顶层目录下
2. 执行 `mvn clean jetty:run`
3. 通过浏览器访问 [http://localhost:8080/hello-world/index.action](http://localhost:8080/hello-world/index.action)

由于 `src/main/webapp/WEB-INF/web.xml` 中已经配置了由名为 `struts2` 的过滤器来处理所有的 url pattern,
所以访问 `http://localhost:8080/hello-world/index.action` 时, `struts2` 过滤器会拦截.
在 `src/main/resources/struts.xml` 中可以找到与 `index.action` 对应的配置.
当 `index.action` 触发时, 应当返回的 view 是 index.jsp.

由于 index.jsp 中有触发 `hello.action` 的链接, 点击此链接后, 会触发 `hello.action`,
实际上由 HelloWorldAction 类的实例执行 `execute` 方法来处理.
execute 函数返回 SUCCESS(即 "success"), `struts.xml` 中的配置表明此时对应的 view 为 `HelloWorld.jsp`.
`HelloWorld.jsp` 中有 `<s:property value="messageStore.message" />`, 这会导致 `HelloWorldAction` 中的 `getMessageStore` 方法被调用,
之后 `MessageStore` 的 `getMessage` 方法再被调用.

反复访问 [http://localhost:8080/hello-world/hello.action](http://localhost:8080/hello-world/hello.action) 会看到 HelloWorldAction 类的构造函数也会被多次调用