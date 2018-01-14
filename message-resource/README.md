# 如何使用
切换到本模块顶层目录下, 执行 `mvn clean jetty:run`,
通过浏览器访问 [http://localhost:8080/message-resource/index.action](http://localhost:8080/message-resource/index.action)
可以看到有3个链接, 分别为
1. [Please register](http://localhost:8080/message-resource/registerInput.action?request_locale=en)
2. [请注册](http://localhost:8080/message-resource/registerInput.action?request_locale=zh_CN)
3. [請註冊](http://localhost:8080/message-resource/registerInput.action?request_locale=zh_HK)

点击不同的链接, 会出现不同语言的注册页面(实际上都是由 `register.jsp` 控制的, 由于读取了不同的 `.properties` 文件, `register.jsp` 中的值会有相应的变化).
具体的实现可以参见 [index.jsp](./src/main/webapp/index.jsp)  

# `.properties` 文件的类型
`.properties` 文件有三类
1. 和某个 Action 类直接对应的 `.properties` 文件应该放置在 `./src/main/resources` 路径下, 且和对应的 Action 类的目录结构应该相同.
例如 [RegisterAction_en.properties](./src/main/resources/com/jyjz/playground/register/action/RegisterAction_en.properties) 是和 
[RegisterAction.java](./src/main/java/com/jyjz/playground/register/action/RegisterAction.java) 对应的
2. 包级别的 `.properties` 文件应该放置在 `./src/main/resources` 路径下, 且和对应的包的目录结构应该相同.
例如 [package_en.properties](./src/main/resources/com/jyjz/playground/package_en.properties) 是和 `com.jyjz.playground` 包对应的, 
这个包中的各个 Action 都可以使用 `package_en.properties` 中的内容
3. 全局有效的 `.properties`  文件应该放置在 `./src/main/resources` 路径下.
例如 [global_en.properties](./src/main/resources/global_en.properties). 要使用它, 需要在 `struts.xml` 里面加上一个配置
`<constant name="struts.custom.i18n.resources" value="global" />`
配置的示例可以参考 [struts.xml](./src/main/resources/struts.xml)

注意要经过"与 Action 对应的 class"的处理后, `.properties` 文件中的内容才能被使用

# `.properties` 文件的用途
`.properties` 文件中的 `key, value 对` 的值可以用于以下两种场合
1. 标签库的 `textfield` 标签的 `key` 属性, 例如 `<s:textfield key="personBean.firstName" />`
2. 标签库的 `text` 标签的 `name` 属性, 例如 `<s:text name="thankyou" />`

# 对 `i18n` 的支持
触发一个 Action 时, 如果指定参数 `request_locale` 为一个特定的语言(例如 `zh_CN`), 
则 Struts 2 在读取 `.properties` 文件时, 会尝试找到文件名对应于那个语言的 `.properties` 文件.
例如如果指定的语言为 `zh_CN`, 和 `RegisterAction.java` 对应的 `.properties` 文件就是 `RegisterAction_zh_CN.properties` 