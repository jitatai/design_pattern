package com.jt.design_pattern.structural.flyweight;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 14:04
 */
public class ConcreteFlyWeight implements FlyWeight {
    private String key;
    protected ConcreteFlyWeight(String key){
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }
    @Override
    public String operation(UnSharedConcreteFlyWeight state) {
        System.out.print("具体享元：" + key + "被调用，");
        System.out.println("非享元信息为：" + state.getInfo());
        return "flyWeight";
    }
}
