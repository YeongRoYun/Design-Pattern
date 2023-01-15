package edu.pattern.design.Flyweight;

import java.util.ArrayList;

/**
 * BigString : Client 의 역할로, Flyweight Factory 를 통해 Instance 를 생성한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class BigString {
    private ArrayList<BigChar> bigchars = new ArrayList<>();

    public BigString(String str) {
        final var factory = BigCharFactory.getInstance();
        for (int i = 0; i < str.length(); i++) {
            bigchars.add(factory.getBigChar(str.charAt(i)));
        }
    }

    public String print() {
        final var builder = new StringBuilder();
        for (final var elm :
                bigchars) {
            builder.append(elm.print());
        }
        return builder.toString();
    }
}