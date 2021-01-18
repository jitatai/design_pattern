package com.jt.design_pattern.behavioral.observer.javautil;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/18 10:06
 */
public class Bear implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}
