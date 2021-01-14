package com.jt.design_pattern.structural.composite.security;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 16:23
 */
public class Leaf implements Component {
    private String name;
    protected Leaf(String name){
        this.name = name;
    }
    @Override
    public void operation() {
        System.out.println(name + "：被访问！");
    }
}
