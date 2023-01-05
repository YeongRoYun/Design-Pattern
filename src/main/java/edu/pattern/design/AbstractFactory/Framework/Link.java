package edu.pattern.design.AbstractFactory.Framework;

import java.net.URL;

/**
 * Link : hyperLink 의 추상 클래스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public abstract class Link extends Item {
    protected final URL url;

    public Link(String caption, URL url) {
        super(caption);
        this.url = url;
    }
}