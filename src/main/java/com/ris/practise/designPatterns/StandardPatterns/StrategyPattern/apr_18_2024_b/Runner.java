package com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b;

import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.Games.BaseGameClass;
import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.Games.Fifa;
import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.Games.OneDayCricket;
import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.Games.TestCricket;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner {
    public static void main(String args[]) {
        BaseGameClass oneDay = new OneDayCricket();
        BaseGameClass fifaMatch = new Fifa();
        BaseGameClass testMatch = new TestCricket();

        oneDay.playTheGame();
        fifaMatch.playTheGame();
        testMatch.playTheGame();

    }
}
