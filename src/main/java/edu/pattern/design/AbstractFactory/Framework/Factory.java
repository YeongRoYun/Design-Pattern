package edu.pattern.design.AbstractFactory.Framework;

import java.net.URL;

/**
 * Factory : Abstract Factory 의 핵심. Abstract products 를 만든다. Factory Method 와 차이는 단일 종류의 제품을 만드는지, 제품군을 만드는지이다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public abstract class Factory {
    public static Factory getFactory(String name) throws Exception {
        return (Factory) Class.forName(name).getDeclaredConstructor().newInstance();
    }

    public abstract Link createLink(String caption, URL url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}