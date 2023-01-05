package edu.pattern.design.AbstractFactory.ListFactory;

import edu.pattern.design.AbstractFactory.Framework.Tray;

/**
 * ListTray
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        final var builder = new StringBuilder();
        builder.append("<ul>");
        tray.forEach(item -> builder.append("<li>").append(item.makeHTML()).append("</li>"));
        builder.append("</ul>");
        return builder.toString();
    }
}