package com.project.dingtalk.robot.entity;

/**
 * PACKAGE      :  com.project.dingtalk.robot.entity
 * CREATE DATE  :  2017/7/12
 * AUTHOR       :  xiaoyi.xie
 * 文件描述      :
 */
public class LinkMessage {

    private String msgtype = "link";
    private Link link;

    public LinkMessage(String title, String text, String picUrl, String messageUrl) {
        this.link = new Link(title, text, picUrl, messageUrl);
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

}