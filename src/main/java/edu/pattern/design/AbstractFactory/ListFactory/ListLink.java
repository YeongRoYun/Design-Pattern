package edu.pattern.design.AbstractFactory.ListFactory;

import edu.pattern.design.AbstractFactory.Framework.Link;

import java.net.URL;

/**
 * ListLink
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public class ListLink extends Link {
    public ListLink(String caption, URL url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return String.format("<a href=%s>%s</a>", url.toString(), caption);
    }
}