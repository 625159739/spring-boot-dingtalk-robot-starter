package com.project.dingtalk.robot.entity;

/**
 * PACKAGE      :  com.project.dingtalk.robot.entity
 * CREATE DATE  :  2017/7/12
 * AUTHOR       :  xiaoyi.xie
 * 文件描述      :
 */
public class TestMessage {

    private String msgtype = "text";
    private Text text;
    private At at;

    public TestMessage(String content, String[] atMobiles) {
        this.text = new Text(content);
        this.at = new At(atMobiles);
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public At getAt() {
        return at;
    }

    public void setAt(At at) {
        this.at = at;
    }

}