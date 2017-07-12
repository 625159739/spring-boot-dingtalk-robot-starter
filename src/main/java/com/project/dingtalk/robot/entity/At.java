package com.project.dingtalk.robot.entity;

/**
 * PACKAGE      :  com.project.dingtalk.robot.entity
 * CREATE DATE  :  2017/7/12
 * AUTHOR       :  xiaoyi.xie
 * 文件描述      :
 */
public class At {

	private String[] atMobiles;
	private boolean isAtAll;

	public At(String[] atMobiles){
		if(atMobiles!=null&&atMobiles.length>0){
			this.atMobiles=atMobiles;
			this.isAtAll=false;
		}else{
			this.atMobiles=new String[0];
			this.isAtAll=true;
		}
	}

	public String[] getAtMobiles() {
		return atMobiles;
	}

	public void setAtMobiles(String[] atMobiles) {
		this.atMobiles = atMobiles;
	}

	public boolean isAtAll() {
		return isAtAll;
	}

	public void setAtAll(boolean atAll) {
		isAtAll = atAll;
	}

}