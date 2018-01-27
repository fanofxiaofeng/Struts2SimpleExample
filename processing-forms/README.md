1. 切换到本模块顶层目录下
2. 执行 `mvn clean jetty:run`,
3. 之后通过浏览器访问 [http://localhost:8080/processing-forms/index.action](http://localhost:8080/processing-forms/index.action)

[index.jsp](./src/main/webapp/index.jsp) 页面中提供了两种方式触发 `register.action`
1. 先跳转到 `register.jsp` 页面, 填写好表单后用 post 请求方式触发 `register.action`
2. 直接使用填写好的参数, 用 get 请求的方式触发 `register.action`

在 RegisterAction 中 override `validate` 方法可以对表单的参数(或者 get 请求的参数)进行验证.
本例中有3个条件
1. User must provide a first name
2. User must provide an email address
3. User younger than 18 cannot register

当用户提交表单后, Struts 2 会将用户输入的值传递给 `personBean` 的相应的域.
之后 Struts 2 会自动执行 validate 方法.
可以看到, 当 validate 方法中的 3 个条件不能完全满足时, `addFieldError` 方法会被调用.
If any errors have been added then Struts 2 will not proceed to call the execute method. 
Rather the Struts 2 framework will return input as the result of calling the action.
