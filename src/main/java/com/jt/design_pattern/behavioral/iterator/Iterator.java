package com.jt.design_pattern.behavioral.iterator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 16:33
 */
public interface Iterator {
    boolean hasNext();
    Object next();
    Object first();
}
