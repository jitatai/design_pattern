package com.jt.design_pattern.behavioral.mediator.estate;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 11:18
 */
public class Seller extends Costomer {
    Seller(String name) {
        super(name);
        ClientWindow(50, 100);
    }

    @Override
    public void receive(String from, String message) {
        receiveArea.append(from + "说: " + message + "\n");
        //使滚动条滚动到最底端
        receiveArea.setCaretPosition(receiveArea.getText().length());
    }

    @Override
    public void send(String message) {
        receiveArea.append("我(卖方)说: " + message + "\n");
        //使滚动条滚动到最底端
        receiveArea.setCaretPosition(receiveArea.getText().length());
        mediator.relay(this.getName(),message);
    }
}
