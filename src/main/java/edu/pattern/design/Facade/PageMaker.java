package edu.pattern.design.Facade;

/**
 * PageMaker : Facade 역할로서, 페이지를 만들기 위한 Simple API 를 제공한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class PageMaker {
    private PageMaker() {

    }

    public static String makeWelcomPage(String mailaddr, String dbPath) {
        final var mailprop = Database.getProperties(dbPath);
        final var userName = mailprop.getProperty(mailaddr);
        final var writer = new HtmlWriter();
        final var builder = new StringBuilder();
        builder.append(writer.title("Welcome to " + userName + "'s page!"))
                .append(writer.paragraph("Contact me"))
                .append(writer.mailto(mailaddr, userName))
                .append(writer.close());
        return builder.toString();
    }
}