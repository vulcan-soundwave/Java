##### Web应用程序基础知识：
1. HTML(HyperText Markup Language)
2. 
- URL(Uniform Resource Locator):代表资源的地址信息
协议(scheme)名举例：ftp http mailto file
格式：<协议>://<用户>:<密码>@<主机>:<端口号>/<路径>
eg.http://localhost:8080/JDBCDemo/html/conn.jsp

- URN(Uniform Resource Name):代表某个资源独一无二的名称
- URI(Uniform Resource Identifier):后来的标准制定了URI，URL和URN成为URI的子集

4. HTTP(HyperText Transfer Protocol): 浏览器和Web服务器之间使用的沟通方式

> 基于请求/响应模型
> 无状态通信协议
明白http这两个特性，我们才知道Web应用程序可以做到什么，做不到什么MVC(Model-View-Controller Pattern)模式位和要变化为Model2模式
对于编写Servlet或JSP而言，浏览器使用HTTP发出请求时，最常接触到的就是GET与POST这两种请求方法。
- GET请求：向服务器取得(GET)指定的资源
使用GET方式发送请求，浏览器地址栏上也会出现请求参数信息，但是GET请求可以发送的请求参数长度有限（根据浏览器版本不同），这个时候可以改用POST
- POST请求：请求时发布(POST)信息给服务器
浏览器地址栏上不会出现请求参数信息，过长的请求参数，或如文件上传这类大量数据用POST，或者敏感信息

5. URL编码（URI规范中的百分比编码）
注意保留字符"：""/""?".....用%+十六进制表示

6.动态网页和静态网页
- “静态网页”是指，在请求服务器上的网页时，服务器对网页文件并不做处理，读取文件后直接作为响应传给浏览器
- “动态网页”是指，在服务器响应之前，会根据客户端的请求参数、标头或实际服务器上的状态，以程序的方式动态产生响应内容，再传回浏览器。也就是说动态网页会经过服务器上的程序处理，再传回实际的响应内容。
- 静态的HTML网页如果包含js程序，其会被浏览器执行，而不是服务端程序执行。

##### Servlet/JSP简介
1. 
- JVM(Java Virtual Machine)是Java程序唯一认识的操作系统(.class文件
- Web容器(Container)是Servlet/JSP唯一认得的HTTP服务器
- Web容器（比如Apache Tomcat）运行于JVM上，可以将其视为运行Servlet/JSP上的HTTP服务器，Servlet/JSP程序只认识Web容器
2. Web容器如何公里Servlet/JSP? 给出一个请求/响应的基本例子：
图为：浏览器 <-------------> 实体服务器 <--> HTTP服务程序 <--> Web容器 <--> Servlet
- 客户端（大部分是浏览器）对Web服务器发出HTTP请求；
- HTTP服务器接收到HTTP请求，将请求转由Web容器处理，Web容器会剖析HTTP请求内容，创建各种对象（如HttpServletRequest、HttpServletResponse、HttpSession等）；
- Web容器根据请求的URL决定使用哪个Servlet来处理请求（由开发人员即我事先定义）；
- Servlet根据请求对象（HttpServletRequest）的信息来决定如何处理，通过响应对象（HttpServletResponse）来创建响应；
- Web容器和Http服务器沟通，Web服务器将响应转换为HTTP响应并传回客户端。

3.Servlet与JSP的关系
- Servlet与JSP一体两面，JSP会被Web容器转译为Servlet的".java"源文件、编译为".class"文件，然后加载到容器之中，所以最后提供服务的还是Servlet实例(Instance)。
- 最好不要再Servlet中夹杂HTML，也不要在JSP中编写Java程序代码。
- 对于每个请求，Web容器会创建一个线程并转发给合适的Servlet处理，因而可以大幅减轻性能上的负担，但因此也要注意线程安全问题。

4. 关于MVC/Model 2
- MVC：Model（模型）、View（视图）、Controller（控制器）
- 模型不会有画面相关的程序代码
- 视图负责画面相关逻辑
- 控制器知道某个操作必须调用哪些模型
- Web应用程序基于HTTP，必须基于请求/响应模型，没有请求没有响应，所以对MVC行为做了变化，就是形成了Model 2架构

5. Java EE
- Java EE：企业级...  标准
- Servlet/JSP，只是Java EE中Web容器中的一个技术规范，Java EE体系分厂庞大
- Servlet/JSP在Java EE中，主要在接受客户端（浏览器）的请求，收集请求信息并转发后端服务对象进行处理，而处理完的信息才交由Servlet/JSP来对客户端进行响应。

##### Others：

- JDBC:Java DataBase Connectivity，是Java数据库的标准规范。它定义一组标准类与接口，应用程序需要连接数据库时就调用这组标准API，而标准API中的接口会由数据库厂实现，通常称为JDBC驱动程序(Driver)
  无需依赖于特定的数据库API(Application Programming Interface)

attribute(属性)
























