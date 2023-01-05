package edu.pattern.design.AbstractFactory.Framework;

import java.util.ArrayList;

/**
 * Tray : Link 나 Tray(Collection) 를 모은 클래스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public abstract class Tray extends Item {
    protected final ArrayList<Item> tray;

    public Tray(String caption) {
        super(caption);
        this.tray = new ArrayList<>();
    }

    public void add(Item item) {
        tray.add(item);
    }
}