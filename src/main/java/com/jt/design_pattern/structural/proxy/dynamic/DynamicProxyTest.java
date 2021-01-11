package com.jt.design_pattern.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/11 16:40
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        AbstructSubject subject = (AbstructSubject)Proxy.newProxyInstance(AbstructSubject.class.getClassLoader(), new Class[]{AbstructSubject.class}, new DynamicProxy(new RealSubject()));
        subject.request();
    }
}
