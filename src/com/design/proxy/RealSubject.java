package com.design.proxy;

/**
 * @ProjectName: proxy-test
 * @Package: com.design.proxy
 * @ClassName: RealSubject
 * @Description: 具体实现类
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class RealSubject implements  Subject {
    @Override
    public void buyHouse() {
        System.out.println("买房子");
    }
}
