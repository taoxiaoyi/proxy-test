package com.design.proxy;

/**
 * @ProjectName: proxy-test
 * @Package: com.design.proxy
 * @ClassName: Test
 * @Description: 静态代理测试类
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("==非代理模式==");
        Subject subject = new RealSubject();
        subject.buyHouse();
        System.out.println("==静态代理模式==");
        Subject proxy = new Proxy(subject);
        proxy.buyHouse();
    }
}
