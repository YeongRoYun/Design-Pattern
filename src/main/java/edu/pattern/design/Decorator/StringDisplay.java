package edu.pattern.design.Decorator;

/**
 * StringDisplay : Concrete Component
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class StringDisplay extends Display {
    String content;

    public StringDisplay(String content) {
        this.content = content;
    }

    @Override
    public Integer getColumns() {
        return content.length();
    }

    @Override
    public Integer getRows() {
        return 1;
    }

    @Override
    public String getRowText(Integer index) {
        return (index < 1) ? content : null;
    }
}