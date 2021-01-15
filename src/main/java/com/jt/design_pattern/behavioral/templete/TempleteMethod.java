package com.jt.design_pattern.behavioral.templete;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 9:10
 */
public abstract class TempleteMethod {
    public void templeteMethod(){
        abstractMethod1();
        hookMethod1();
        if (hookMehtod2()){
            specificMethod();
        }
        abstractMethod2();
    }
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
    public void hookMethod1(){

    }
    public boolean hookMehtod2(){
        return false;
    }
    public void specificMethod(){
        System.out.println("具体方法的执行");
    }
}
