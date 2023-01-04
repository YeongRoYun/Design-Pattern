package edu.pattern.design.Adapter;

/**
 * Banner : 제공된 API (수정 불가능)
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class Banner {
    String showWithParen(String content) {
        return "(" + content + ")";
    }

    String showWithAster(String content) {
        return "*" + content + "*";
    }
}