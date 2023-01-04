package edu.pattern.design.TemplateMethod;

/**
 * StringDisplay : Template 의 SubMethod 를 구현하는 Concrete Class
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class StringDisplay extends AbstractDisplay {
    @Override
    protected String open() {
        return "*****************\n";
    }

    @Override
    protected String print(String content) {
        return "* " + content + "\n";
    }

    @Override
    protected String close() {
        return "*****************\n";
    }
}