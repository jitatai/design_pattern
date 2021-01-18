package com.jt.design_pattern.behavioral.observer.javautil;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/18 10:05
 */
public class Bull implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
        }
    }
}
