package com.jt.design_pattern.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/11 16:35
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;
    public DynamicProxy(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }
}
