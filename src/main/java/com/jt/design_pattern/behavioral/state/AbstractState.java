package com.jt.design_pattern.behavioral.state;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 16:07
 */
public abstract class AbstractState {
    protected String stateName;
    protected int score;
    protected ScoreContext scoreContext;
    AbstractState(ScoreContext scoreContext){
        this.scoreContext = scoreContext;
        stateName = "不及格";
        score = 0;
    }

    AbstractState(AbstractState state){
        this.scoreContext = state.scoreContext;
        stateName = "不及格";
        score = state.score;
    }

    public  void addScore(int score){
        this.score += score;
        System.out.print("加上：" + score + "分，\t当前分数：" + this.score);
        checkState();
        System.out.println("分，\t当前状态：" + scoreContext.getState().stateName);
    }
    public  void checkState(){
        if (score >= 90) {
            scoreContext.setState(new HighState(this));
        } else if (score >= 60) {
            scoreContext.setState(new MiddleState(this));
        }else if (score < 60){
            scoreContext.setState(new LowState(this));
        }
    }
}
