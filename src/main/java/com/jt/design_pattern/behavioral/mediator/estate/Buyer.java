package com.jt.design_pattern.behavioral.mediator.estate;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 11:18
 */
public class Buyer extends Costomer {
    Buyer(String name) {
        super(name);
        ClientWindow(350, 100);
    }

    @Override
    public void receive(String from, String message) {
        receiveArea.append(from + "说: " + message + "\n");
        //使滚动条滚动到最底端
        receiveArea.setCaretPosition(receiveArea.getText().length());
    }

    @Override
    public void send(String message) {
        receiveArea.append("我(买方)说: " + message + "\n");
        //使滚动条滚动到最底端
        receiveArea.setCaretPosition(receiveArea.getText().length());
        mediator.relay(this.getName(),message);
    }
}
