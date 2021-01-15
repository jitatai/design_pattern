package com.jt.design_pattern.behavioral.command;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 10:22
 */
public class Receiver2 implements Receiver{
    @Override
    public void action(){
        System.out.println("接收者2的具体行为");
    }
}
