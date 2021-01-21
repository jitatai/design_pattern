package com.jt.design_pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 16:35
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list;
    private int index = -1;

    ConcreteIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return list.get(++index);
    }

    @Override
    public Object first() {
        return list.get(0);
    }
}
