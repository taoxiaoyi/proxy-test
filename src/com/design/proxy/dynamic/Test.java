package com.design.proxy.dynamic;

import com.design.proxy.RealSubject;
import com.design.proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * @ProjectName: proxy-test
 * @Package: com.design.proxy.dynamic
 * @ClassName: Test
 * @Description: 动态代理测试类
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("==动态代理模式==");
        Subject subject = new RealSubject();
        Subject subject1 = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),new Class[] {Subject.class},new DynamicProxy(subject));
        subject1.buyHouse();
    }
}
