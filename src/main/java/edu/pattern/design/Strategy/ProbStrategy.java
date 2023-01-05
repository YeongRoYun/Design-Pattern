package edu.pattern.design.Strategy;

import java.util.Arrays;
import java.util.Random;

/**
 * ProbStrategy
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class ProbStrategy implements Strategy {
    private final Random random;
    // one step before 의 기록을 보고 추론
    // history[cur][prv] = cur - prv 의 승수
    private final int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
    };
    private Hand prevHand;
    private Hand currentHand;

    public ProbStrategy(int seed) {
        random = new Random();
        random.setSeed(seed);
        currentHand = Hand.getHand(Hand.Type.Rock);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHand));
        if (bet < history[currentHand.getType().ordinal()][0]) {
            prevHand = currentHand;
            currentHand = Hand.getHand(Hand.Type.Rock);
        } else if (bet < history[currentHand.getType().ordinal()][1]) {
            prevHand = currentHand;
            currentHand = Hand.getHand(Hand.Type.Scissor);
        } else {
            prevHand = currentHand;
            currentHand = Hand.getHand(Hand.Type.Paper);
        }
        return currentHand;
    }

    private int getSum(Hand currentHand) {
        return Arrays.stream(history[currentHand.getType().ordinal()]).sum();
    }

    /**
     * 비기거나 이긴 쪽을 증가시킨다.
     *
     * @author teddy
     * @since 2023/01/06
     **/
    @Override
    public void study(boolean win) {
        if (win) {
            history[currentHand.getType().ordinal()][prevHand.getType().ordinal()] += 1;
        } else {
            history[(currentHand.getType().ordinal() + 1) % 3][prevHand.getType().ordinal()] += 1;
            history[(currentHand.getType().ordinal() + 2) % 3][prevHand.getType().ordinal()] += 1;
        }
    }
}