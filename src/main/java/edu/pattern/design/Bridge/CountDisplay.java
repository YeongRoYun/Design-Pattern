package edu.pattern.design.Bridge;

/**
 * CountDisplay : Functional Class 의 추가 기능
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public String multiDisplay(String content, int cnt) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            builder.append(open());
            builder.append(content);
            builder.append(close());
            builder.append("\n");
        }
        return builder.toString();
    }
}