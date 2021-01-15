package com.jt.design_pattern.behavioral.chainofresponsibility;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 13:41
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void doFiler(Command command) {
        if (command instanceof OneCommand){
            command.execute();
        }else {
            if (getNext() != null){
                getNext().doFiler(command);
            }else {
                System.out.println("null");
            }
        }
    }
}
