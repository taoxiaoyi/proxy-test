package com.design.proxy.dynamic;

import com.design.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: proxy-test
 * @Package: com.design.proxy.dynamic
 * @ClassName: DynamicProxy
 * @Description: 动态代理类
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class DynamicProxy implements InvocationHandler {

    Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        System.out.println("商量价格");
        System.out.println("签合同");
        return result;
    }
}
