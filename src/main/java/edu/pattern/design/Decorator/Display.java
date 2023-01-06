package edu.pattern.design.Decorator;

/**
 * Display : Component 역할로, Transparent API 를 정의한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public abstract class Display {
    public abstract Integer getColumns();

    public abstract Integer getRows();

    public abstract String getRowText(Integer index);

    public String show() {
        final var builder = new StringBuilder();
        for (int i = 0; i < getRows(); i++) {
            builder.append(getRowText(i)).append("\n");
        }
        return builder.toString();
    }
}