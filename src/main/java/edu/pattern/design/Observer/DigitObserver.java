package edu.pattern.design.Observer;

/**
 * DigitObserver : Concrete Observer
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class DigitObserver implements Observer{
    @Override
    public void update(NumberGenerator gen) {
        System.out.println("DigitObserver : val=" + gen.getNumber());
    }
}