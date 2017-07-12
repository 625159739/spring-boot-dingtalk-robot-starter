package com.project.dingtalk.robot.send;

import com.project.dingtalk.robot.entity.LinkMessage;
import com.project.dingtalk.robot.entity.MarkdownMessage;
import com.project.dingtalk.robot.entity.TestMessage;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

/**
 * PACKAGE      :  com.project.dingtalk.robot.send
 * CREATE DATE  :  2017/7/12
 * AUTHOR       :  xiaoyi.xie
 * 文件描述      :
 */
public class RobotSendServices {

	private RestTemplate restTemplate = new RestTemplate();

	/**
	 * 发送普通文本消息
	 * @param webhook    钉钉群组的机器人的Hook地址
	 * @param content    消息内容
	 * @param atMobiles  被@人的手机号
	 */
	public void sendTestMessage(String webhook,String content,String[] atMobiles){
		TestMessage testMessage=new TestMessage(content,atMobiles);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<TestMessage> entity = new HttpEntity<TestMessage>(testMessage, headers);
		restTemplate.postForEntity(webhook, entity,Void.class);
	}

	/**
	 * 发送link类型消息
	 * @param webhook       钉钉群组的机器人的Hook地址
	 * @param title         消息标题
	 * @param text          消息内容。如果太长只会部分展示
	 * @param picUrl        图片URL
	 * @param messageUrl    点击消息跳转的URL
	 */
	public void sendLinkMessage(String webhook,String title,String text,String picUrl,String messageUrl){
		LinkMessage linkMessage=new LinkMessage(title,text,picUrl,messageUrl);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<LinkMessage> entity = new HttpEntity<LinkMessage>(linkMessage, headers);
		restTemplate.postForEntity(webhook, entity,Void.class);
	}

	/**
	 * 发送markdown类型消息
	 * @param webhook     钉钉群组的机器人的Hook地址
	 * @param title       首屏会话透出的展示内容
	 * @param text        markdown格式的消息
	 * @param atMobiles   被@人的手机号(在text内容里要有@手机号)
	 */
	public void sendMarkdownMessage(String webhook,String title,String text,String[] atMobiles){
		MarkdownMessage markdownMessage=new MarkdownMessage(title,text,atMobiles);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<MarkdownMessage> entity = new HttpEntity<MarkdownMessage>(markdownMessage, headers);
		restTemplate.postForEntity(webhook, entity,Void.class);
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

}