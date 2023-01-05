package edu.pattern.design.AbstractFactory.ListFactory;

import edu.pattern.design.AbstractFactory.Framework.Page;

/**
 * ListPage
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        final var builder = new StringBuilder();
        builder.append("<html>");
        builder.append("<head>").append("<title>").append(title).append("</title>").append(String.format("<meta author=%s />", author)).append("</head>");
        builder.append("<body>");
        contents.forEach(content -> builder.append(content.makeHTML()));
        builder.append("</body>");
        builder.append("</html>");
        return builder.toString();
    }
}