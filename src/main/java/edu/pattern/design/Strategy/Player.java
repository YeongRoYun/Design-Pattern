package edu.pattern.design.Strategy;

/**
 * Player : Strategy 를 사용하는 Class
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class Player {
    private final Strategy strategy;
    private final String name;
    private int winCount;
    private int loseCount;
    private int drawCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.strategy = strategy;
        this.name = name;
        this.winCount = 0;
        this.loseCount = 0;
        this.drawCount = 0;
        this.gameCount = 0;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        ++gameCount;
        ++winCount;
    }

    public void draw() {
        ++gameCount;
        ++drawCount;
    }

    public void lose() {
        strategy.study(false);
        ++gameCount;
        ++loseCount;
    }

    @Override
    public String toString() {
        return "[" + name + " : " + gameCount + "(" + winCount + "/" + drawCount + "/" + loseCount + ")" + "]";
    }
}