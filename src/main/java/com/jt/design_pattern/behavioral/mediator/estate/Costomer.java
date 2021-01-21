package com.jt.design_pattern.behavioral.mediator.estate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 10:59
 */
public abstract class Costomer extends JFrame implements ActionListener {
    String name;
    JTextField sendText;
    JTextArea receiveArea;
    Mediator mediator;

    Costomer(String name){
        super(name);
        this.name = name;
    }
    public abstract void receive(String from,String message);
    public abstract void send(String message);
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    void ClientWindow(int x, int y) {
        Container cp;
        JScrollPane sp;
        JPanel p1, p2;
        cp = this.getContentPane();
        sendText = new JTextField(18);
        receiveArea = new JTextArea(10, 18);
        receiveArea.setEditable(false);
        p1 = new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("接收内容："));
        p1.add(receiveArea);
        sp = new JScrollPane(p1);
        cp.add(sp, BorderLayout.NORTH);
        p2 = new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("发送内容："));
        p2.add(sendText);
        cp.add(p2, BorderLayout.SOUTH);
        sendText.addActionListener(this);
        this.setLocation(x, y);
        this.setSize(250, 330);
        this.setResizable(false); //窗口大小不可调整
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tempInfo = sendText.getText().trim();
        sendText.setText("");
        this.send(tempInfo);
    }
    @Override
    public String getName() {
        return name;
    }
}
