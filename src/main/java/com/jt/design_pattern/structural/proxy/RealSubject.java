package com.jt.design_pattern.structural.proxy;

import javax.swing.*;
import java.awt.*;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/11 15:01
 */
public class RealSubject extends JFrame implements Subject {

    public RealSubject(){
        super("韶关代理婺源特产测试");
        this.setLayout(new GridLayout(1, 1));
        JLabel l1 = new JLabel(new ImageIcon("src/main/resources/file/WuyuanSpecialty.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void request() {
        this.setVisible(true);
        System.out.println("访问真实主题方法...");
    }
}
