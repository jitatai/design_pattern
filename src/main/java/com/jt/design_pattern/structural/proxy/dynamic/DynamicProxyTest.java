package com.jt.design_pattern.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/11 16:40
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        AbstructSubject subject = (AbstructSubject)Proxy.newProxyInstance(AbstructSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), new DynamicProxy(new RealSubject()));
        AbstructSubject realSubject = new DynamicProxy(new RealSubject()).bind(new RealSubject());
        realSubject.request();
        subject.request();
    }
}
