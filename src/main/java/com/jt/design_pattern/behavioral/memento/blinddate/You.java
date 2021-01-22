package com.jt.design_pattern.behavioral.memento.blinddate;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 13:37
 */
public class You {
    private String wifeName;

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public String getWifeName() {
        return wifeName;
    }

    public Girl createWife(){
        return new Girl(this.wifeName);
    }

    public void reloadWife(Girl girl){
        setWifeName(girl.getName());
    }
}
