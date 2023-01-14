package edu.pattern.design.Observer;

/**
 * GraphObserver : Concrete Observer
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator gen) {
        System.out.println("GraphObserver : val=" + "*".repeat(gen.getNumber()));
    }
}