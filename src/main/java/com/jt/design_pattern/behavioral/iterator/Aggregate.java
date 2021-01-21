package com.jt.design_pattern.behavioral.iterator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 16:29
 */
public interface Aggregate {
    void add(Object object);
    void remove(Object object);
    Iterator getIterator();
}
