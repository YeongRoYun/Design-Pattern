package edu.pattern.design.Strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * StrategyTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class StrategyTest {
    @Test
    @DisplayName("Strategy Main Test : Print Result")
    void test() {
        //given
        final var player1 = new Player("player1", new WinningStrategy(1));
        final var player2 = new Player("player2", new ProbStrategy(1));
        Hand hand1, hand2;
        //when
        for (int i = 0; i < 10000; i++) {
            hand1 = player1.nextHand();
            hand2 = player2.nextHand();
            if (hand1.isStronger(hand2)) {
                player1.win();
                player2.lose();
            } else if (hand1.isWeakerThan(hand2)) {
                player1.lose();
                player2.win();
            } else {
                player1.draw();
                player2.draw();
            }
        }
        //then
        System.out.println("Name : GameCount(WinCount/DrawCount/LoseCount)");
        System.out.println(player1);
        System.out.println(player2);
    }
}