package com.jt.design_pattern.behavioral.observer.javautil;

import java.util.Observable;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/18 10:00
 */
public class OilFutures extends Observable {
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        setChanged();
        notifyObservers(price);
    }
}
