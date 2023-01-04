package edu.pattern.design.TemplateMethod;

/**
 * AbstractDisplay : Template Method 를 정의하는 Abstract Class
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public abstract class AbstractDisplay {
    public String display(String content) {
        final StringBuilder output = new StringBuilder();
        output.append(open());
        for (int i = 0; i < 5; i++) {
            output.append(print(content));
        }
        output.append(close());
        return output.toString();
    }

    protected abstract String open();

    protected abstract String print(String content);

    protected abstract String close();
}
