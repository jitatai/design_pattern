package com.jt.design_pattern.behavioral.memento.blinddate;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 13:43
 */
public class GirlStack {
    private Girl[] girls;
    private int top = -1;
    GirlStack(){
        girls = new Girl[4];
    }
    boolean push(Girl girl){
        if (top >= 3){
            return false;
        }
        girls[++top] = girl;
        return true;
    }
    Girl pop(){
        if (top < 0){
            return new Girl("空白");
        }
        return girls[top--];
    }
}
