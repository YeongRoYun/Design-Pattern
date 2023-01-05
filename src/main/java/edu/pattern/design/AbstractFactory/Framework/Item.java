package edu.pattern.design.AbstractFactory.Framework;

/**
 * Item : Abstract Product 의 공통 부분을 모은 클래스. instanceof 를 이용하는 것은 지양해야 한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}