package com.project.dingtalk.robot.config;

import com.project.dingtalk.robot.send.RobotSendServices;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * PACKAGE      :  com.project.dingtalk.robot.config
 * CREATE DATE  :  2017/7/12
 * AUTHOR       :  xiaoyi.xie
 * 文件描述      :
 */
@Configuration
public class DingTalkRobotAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public RobotSendServices robotSendServices(){
		return new RobotSendServices();
	}

}