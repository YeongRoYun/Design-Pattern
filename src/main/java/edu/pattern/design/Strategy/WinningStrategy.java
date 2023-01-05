package edu.pattern.design.Strategy;

import java.util.Random;

/**
 * WinningStrategy
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class WinningStrategy implements Strategy {
    private final Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random();
        random.setSeed(seed);
    }

    @Override
    public Hand nextHand() {
        if (won) {
            return prevHand;
        } else {
            int nxt = random.nextInt(3);
            if (nxt == 0) {
                prevHand = Hand.getHand(Hand.Type.Rock);
            } else if (nxt == 1) {
                prevHand = Hand.getHand(Hand.Type.Scissor);
            } else {
                prevHand = Hand.getHand(Hand.Type.Paper);
            }
            return prevHand;
        }
    }

    @Override
    public void study(boolean win) {
        this.won = win;
    }
}