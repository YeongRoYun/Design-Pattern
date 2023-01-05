package edu.pattern.design.Strategy;

import lombok.Getter;

/**
 * Hand : Rock, Scissor, Paper.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class Hand {
    private final static Hand[] hands = {new Hand(Type.Rock), new Hand(Type.Scissor), new Hand(Type.Paper)};
    @Getter private final Type type;

    private Hand(Type type) {
        this.type = type;
    }

    public static Hand getHand(Type type) {
        return hands[type.ordinal()];
    }

    public boolean isStronger(Hand other) {
        return fight(other) == 1;
    }

    public boolean isWeakerThan(Hand other) {
        return fight(other) == -1;
    }

    private int fight(Hand other) {
        if (this == other) {
            return 0;
        } else if ((this.type.ordinal() + 1) % 3 == other.type.ordinal()) {
            return 1;
        } else {
            return -1;
        }
    }

    enum Type {
        Rock,
        Scissor,
        Paper,
    }
}