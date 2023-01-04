package edu.pattern.design.TemplateMethod;

/**
 * CharDisplay : Template 의 SubMethod 를 구현하는 Concrete Class
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class CharDisplay extends AbstractDisplay {
    @Override
    protected String open() {
        return "<<";
    }

    @Override
    protected String print(String content) throws IllegalArgumentException {
        if (content.length() > 1) {
            throw new IllegalArgumentException();
        }
        return content;
    }

    @Override
    protected String close() {
        return ">>";
    }
}