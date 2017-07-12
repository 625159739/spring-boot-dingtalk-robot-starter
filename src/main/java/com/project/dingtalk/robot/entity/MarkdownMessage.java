package com.project.dingtalk.robot.entity;

/**
 * PACKAGE      :  com.project.dingtalk.robot.entity
 * CREATE DATE  :  2017/7/12
 * AUTHOR       :  xiaoyi.xie
 * 文件描述      :
 */
public class MarkdownMessage {

	private String msgtype="markdown";
	private Markdown markdown;
	private At at;

	public MarkdownMessage(String title,String text,String[] atMobiles){
		this.markdown=new Markdown(title,text);
		this.at=new At(atMobiles);
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public Markdown getMarkdown() {
		return markdown;
	}

	public void setMarkdown(Markdown markdown) {
		this.markdown = markdown;
	}

	public At getAt() {
		return at;
	}

	public void setAt(At at) {
		this.at = at;
	}

}