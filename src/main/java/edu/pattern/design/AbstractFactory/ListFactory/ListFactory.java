package edu.pattern.design.AbstractFactory.ListFactory;

import edu.pattern.design.AbstractFactory.Framework.Factory;
import edu.pattern.design.AbstractFactory.Framework.Link;
import edu.pattern.design.AbstractFactory.Framework.Page;
import edu.pattern.design.AbstractFactory.Framework.Tray;

import java.net.URL;

/**
 * ListFactory
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, URL url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}