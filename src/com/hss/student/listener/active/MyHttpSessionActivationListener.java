package com.hss.student.listener.active;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
/*
> 用于监听现在session的值 是 钝化 （序列化）还是活化 （反序列化）的动作

* 钝化 （序列化）

> 把内存中的数据 存储到硬盘上

* 活化 （反序列化）

> 把硬盘中的数据读取到内存中。


* session的钝化活化的用意何在

>  session中的值可能会很多， 并且我们有很长一段时间不使用这个内存中的值， 那么可以考虑把session的值可以存储到硬盘上【钝化】，等下一次在使用的时候，在从硬盘上提取出来。 【活化】


 做配置即可

	1. 在tomcat里面 conf/context.xml 里面配置

			对所有的运行在这个服务器的项目生效

	2. 在conf/Catalina/localhost/context.xml 配置

			对 localhost生效。  localhost:8080

	3. 在自己的web工程项目中的 META-INF/context.xml

			只对当前的工程生效。

		maxIdleSwap ： 1分钟不用就钝化
		directory ：  钝化后的那个文件存放的目录位置。

			D:\tomcat\apache-tomcat-7.0.52\work\Catalina\localhost\ListenerDemo\itheima

		<Context>
			<Manager className="org.apache.catalina.session.PersistentManager" maxIdleSwap="1">
				<Store className="org.apache.catalina.session.FileStore" directory="itheima"/>
			</Manager>
		</Context>

 */
public class MyHttpSessionActivationListener implements HttpSessionActivationListener {

    //钝化
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.err.println("session被钝化了...");
    }

    //活化
    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.err.println("session被活化了...");
    }
}
