package edu.pattern.design.Decorator;

/**
 * SideBorder : Concrete Border
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class SideBorder extends Border {
    public SideBorder(Display display) {
        super(display);
    }

    @Override
    public Integer getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public Integer getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(Integer index) {
        final var builder = new StringBuilder();
        final var content = display.getRowText(index);
        builder.append('|').append(content).append('|');
        return builder.toString();
    }
}