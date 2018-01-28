1. 切换到本模块顶层目录下
2. 执行 `mvn clean jetty:run`,
3. 之后通过浏览器访问 [http://localhost:8080/naive-interceptor/index.action](http://localhost:8080/naive-interceptor/index.action) 
或者直接运行 [main.py](./scripts/main.py)
4. 通过浏览器访问 [http://localhost:8080/naive-interceptor/paramsCanBeSet.action?something=汉字比较容易被看到](http://localhost:8080/naive-interceptor/paramsCanBeSet.action?something=汉字比较容易被看到)
以及 [http://localhost:8080/naive-interceptor/paramsCanNotBeSet.action?something=汉字比较容易被看到](http://localhost:8080/naive-interceptor/paramsCanNotBeSet.action?something=汉字比较容易被看到)


主要参考了下列文章
1. [Introducing Interceptors](http://struts.apache.org/getting-started/introducing-interceptors.html)
2. [Writing Interceptors](http://struts.apache.org/core-developers/writing-interceptors.html)
3. [Struts 2 - Interceptors](https://www.tutorialspoint.com/struts_2/struts_interceptors.htm)
