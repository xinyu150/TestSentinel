package com.xinyu.testProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

/**
 * 	需要启动sentinel控制板
 * @author: yx
 * @date: 2019年7月17日 上午9:55:23
 */
@SpringBootApplication
@EnableAutoConfiguration
public class TestSentinelApplication {
	
	public static void main(String[] args) {
//		instanceFlowRules();				// 使用此方法配置规则后，控制板界面不能监控接口信息了，如果在前台配置规则，就可以看到监控信息；
		SpringApplication.run(TestSentinelApplication.class, args);
	}
	
	@Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }
	
//	// 初始化规则类
//	private static void instanceFlowRules() {
//        List<FlowRule> list = new ArrayList<>();
//        // 第一个规则，限制 /test接口 每秒2个
//        FlowRule flowRule = new FlowRule();
//        flowRule.setResource("/test");
//        flowRule.setCount(2);					// 20qps
//        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        
//        // 第二个规则，限制 /test接口 每秒2个
//        FlowRule flowRule1 = new FlowRule();
//        flowRule1.setResource("testResource1");
//        flowRule1.setCount(2);					// 20qps
//        flowRule1.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        // 把规则加入list
//        list.add(flowRule);
//        list.add(flowRule1);
//        FlowRuleManager.loadRules(list);
//    }
		
}
