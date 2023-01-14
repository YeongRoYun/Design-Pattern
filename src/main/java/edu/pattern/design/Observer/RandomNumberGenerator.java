package edu.pattern.design.Observer;

import java.util.Random;

/**
 * RandomNumberGenerator : Concrete Subject
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class RandomNumberGenerator extends NumberGenerator {
    private final Random gen = new Random(1);
    private Integer number = -1;

    @Override
    public Integer getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = gen.nextInt(50);
            notifyObservers();
        }
    }
}