package edu.pattern.design.Adapter;

/**
 * PrintBannerByInheritance : Concrete Adapter 를 상속을 이용해 구현한 것
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class PrintBannerByInheritance extends Banner implements Print {
    @Override
    public String printWeak(String content) {
        return showWithParen(content);
    }

    @Override
    public String printStrong(String content) {
        return showWithAster(content);
    }
}