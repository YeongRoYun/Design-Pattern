package edu.pattern.design.AbstractFactory.Framework;

import java.util.ArrayList;

/**
 * Page : Html Page 에 대한 추상 클래스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public abstract class Page {
    protected final String title;
    protected final String author;
    protected final ArrayList<Item> contents;

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
        this.contents = new ArrayList<>();
    }

    public void add(Item item) {
        contents.add(item);
    }
    
    public abstract String makeHTML();
}