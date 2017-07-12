dingtalk-robot
============

# 前言

`dingtalk-robot`项目是接入钉自定义钉机器人接口的定制Spring Boot starter项目,钉钉接口文档如下
-  `https://open-doc.dingtalk.com/`
-  `https://open-doc.dingtalk.com/docs/doc.htm?spm=0.0.0.0.qI0Wz4&treeId=257&articleId=105733&docType=1`


# spring-boot-dingtalk-robot-starter 使用

## spring-boot-dingtalk-robot-starter版本

-  修改pom.xml 文件中的<dingtalk-robot-starter.version>1.5.4.RELEASE</dingtalk-robot-starter.version>
-  1.5.4.RELEASE代表使用Spring Boot 1.5.4.RELEASE 版本

## 使用IDEA Maven 打spring-boot-dingtalk-robot-starter 包

-  `mvn clean compile package install`

## Spring Boot 项目引入spring-boot-dingtalk-robot-starter

```
<dependency>
	<groupId>com.project.dingtalk.robot</groupId>
	<artifactId>spring-boot-dingtalk-robot-starter</artifactId>
	<version>1.5.4.RELEASE</version>
</dependency>
```

## 例子

```
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private RobotSendServices robotSendServices;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String webhook="请配置钉钉群组自定义机器人的HOOK地址";
		String content="我就是我, 是不一样的烟火";
		String[] atMobiles=new String[0];
		robotSendServices.sendTestMessage(webhook,content,atMobiles);

		String title="时代的火车向前开";
		String text="这个即将发布的新版本，创始人陈航（花名“无招”）称它为“红树林";
		String picUrl="";
		String messageUrl="https://mp.weixin.qq.com/s?__biz=MzA4NjMwMTA2Ng==&mid=2650316842&idx=1&sn=60da3ea2b29f1dcc43a7c8e4a7c97a16&scene=2&srcid=09189AnRJEdIiWVaKltFzNTw&from=timeline&isappinstalled=0&key=&ascene=2&uin=&devicetype=android-23&version=26031933&nettype=WIFI";
		robotSendServices.sendLinkMessage(webhook,title,text,picUrl,messageUrl);

		 title="杭州天气";
		 text="#### 杭州天气@156xxxx8827\n" +
				 "> 9度，西北风1级，空气良89，相对温度73%\n\n" +
				 "> ![screenshot](http://image.jpg)\n"  +
				 "> ###### 10点20分发布 [天气](http://www.thinkpage.cn/) \n";
		robotSendServices.sendMarkdownMessage(webhook,title,text,atMobiles);
	}


}
```