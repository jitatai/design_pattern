package com.jt.design_pattern.structural.flyweight;

import java.util.HashMap;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 14:08
 */
public class FlyWeightFactory {
    private HashMap<String,FlyWeight> flyWeights = new HashMap<>();

    public FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = flyWeights.get(key);
        if (flyWeight == null){
            flyWeight = new ConcreteFlyWeight(key);
            flyWeights.put(key,flyWeight);
        }else {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        }
        return flyWeight;
    }
}
