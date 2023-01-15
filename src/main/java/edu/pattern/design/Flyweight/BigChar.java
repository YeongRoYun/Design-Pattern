package edu.pattern.design.Flyweight;

/**
 * BigChar : Flyweight
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        this.fontdata = charname + "'s" + "font";
    }

    String print() {
        return this.fontdata;
    }

}