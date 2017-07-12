package com.project.dingtalk.robot.entity;

/**
 * PACKAGE      :  com.project.dingtalk.robot.entity
 * CREATE DATE  :  2017/7/12
 * AUTHOR       :  xiaoyi.xie
 * 文件描述      :
 */
public class Text {

	/**
	 * 消息内容
	 */
	private String content;

	public Text(String content){
		this.content=content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}