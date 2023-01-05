package edu.pattern.design.Builder;

/**
 * TextBuilder
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public class TextBuilder implements Builder {
    private final StringBuffer buffer = new StringBuffer();

    @Override
    public Builder makeTitle(String title) {
        buffer.append(title).append("\n");
        return this;
    }

    @Override
    public Builder makeString(String content) {
        buffer.append(content).append("\n");
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        for (var item :
                items) {
            buffer.append(item).append("\n");
        }
        return this;
    }

    @Override
    public Builder close() {
        return this;
    }

    public String getResult() {
        return buffer.toString();
    }
}