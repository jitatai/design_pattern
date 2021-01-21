package com.jt.design_pattern.behavioral.iterator;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 16:44
 */
public class IteratorTest {
    @Test
    public void iteratorTest(){
        Aggregate aggregate = new ConcreteAggreate();
        aggregate.add("你好");
        aggregate.add("打工人");

        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
