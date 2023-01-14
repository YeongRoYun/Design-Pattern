package edu.pattern.design.Facade;

/**
 * HtmlWriter : Facade 에서 사용되는 클래스로, 정해진 절차에 맞춰 메소드를 호출해야 한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class HtmlWriter {
    public HtmlWriter() {
    }

    public String title(String title) {
        final var builder = new StringBuilder();
        builder.append("<html>")
                .append("<head>")
                .append("<title>" + title + "</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>" + title + "</h1>");
        return builder.toString();
    }

    public String paragraph(String msg) {
        return "<p>" + msg + "</p>";
    }

    public String link(String href, String caption) {
        return paragraph(String.format("<a href=\"%s\">%s</a>", href, caption));
    }

    public String mailto(String mailaddr, String username) {
        return link("mailto:" + mailaddr, username);
    }

    public String close() {
        final var builder = new StringBuilder();
        return builder.append("</body>")
                .append("</html>")
                .toString();
    }
}