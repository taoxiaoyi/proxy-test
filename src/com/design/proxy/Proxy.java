package com.design.proxy;

/**
 * @ProjectName: proxy-test
 * @Package: com.design.proxy
 * @ClassName: Proxy
 * @Description: 静态代理类
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Proxy implements Subject {

    Subject subject;

    public Proxy (Subject subject) {
        this.subject = subject;
    }

    @Override
    public void buyHouse() {
        subject.buyHouse();
        System.out.println("商量价格");
        System.out.println("签合同");
    }
}
