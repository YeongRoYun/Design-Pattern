package edu.pattern.design.Adapter;

/**
 * PrintBannerByDelegation : Concrete Adapter 를 위임을 통해 구현한 것
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class PrintBannerByDelegation implements Print {
    private final Banner banner;

    public PrintBannerByDelegation() {
        this.banner = new Banner();
    }

    public PrintBannerByDelegation(Banner banner) {
        this.banner = banner;
    }

    @Override
    public String printWeak(String content) {
        return banner.showWithParen(content);
    }

    @Override
    public String printStrong(String content) {
        return banner.showWithAster(content);
    }
}