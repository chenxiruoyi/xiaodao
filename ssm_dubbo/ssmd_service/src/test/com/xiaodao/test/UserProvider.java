package com.xiaodao.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserProvider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/applicationContext-*.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}