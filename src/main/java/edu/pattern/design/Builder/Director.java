package edu.pattern.design.Builder;

/**
 * Director : Builder 의 순서를 명시하는 클래스(Template Method 의 상위 클래스 역할)
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Builder construct() {
        return builder
                .makeTitle("Title")
                .makeString("Content")
                .makeItems(new String[]{"Item1", "Item2"})
                .close();
    }
}