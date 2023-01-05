package edu.pattern.design.Builder;

/**
 * HtmlBuilder
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public class HtmlBuilder implements Builder {
    private final StringBuffer buffer = new StringBuffer();

    @Override
    public Builder makeTitle(String title) {
        buffer.append("<html><head><title>").append(title).append("</title></head>").append("<body>");
        return this;
    }

    @Override
    public Builder makeString(String content) {
        buffer.append("<p>").append(content).append("</p>");
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        buffer.append("<ul>");
        for (var item :
                items) {
            buffer.append("<li>").append(item).append("</li>");
        }
        buffer.append("</ul>");
        return this;
    }

    @Override
    public Builder close() {
        buffer.append("</body></html>");
        return this;
    }

    public String getResult() {
        return buffer.toString();
    }
}