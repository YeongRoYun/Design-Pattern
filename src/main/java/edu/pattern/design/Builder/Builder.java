package edu.pattern.design.Builder;

/**
 * Builder : 인스턴스를 생성하기 위한 각 단계를 명시한 인터페이스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public interface Builder {
    Builder makeTitle(String title);

    Builder makeString(String content);

    Builder makeItems(String[] items);

    Builder close();
}
