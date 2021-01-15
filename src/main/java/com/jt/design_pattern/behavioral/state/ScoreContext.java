package com.jt.design_pattern.behavioral.state;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 16:14
 */
public class ScoreContext {
    private AbstractState state;
    public ScoreContext(){
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score){
        state.addScore(score);
    }
}
