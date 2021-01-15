package com.jt.design_pattern.behavioral.state;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 16:26
 */
public class ScoreContextTest {
    @Test
    public void scoreContextTest(){
        ScoreContext scoreContext = new ScoreContext();
        scoreContext.add(10);
        scoreContext.add(10);
        scoreContext.add(10);
        scoreContext.add(10);
        scoreContext.add(10);
        scoreContext.add(10);
        scoreContext.add(10);
        scoreContext.add(10);
        scoreContext.add(10);
        scoreContext.add(10);
        scoreContext.add(10);
    }
}
