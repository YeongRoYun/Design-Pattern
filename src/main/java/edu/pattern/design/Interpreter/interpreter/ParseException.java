package edu.pattern.design.Interpreter.interpreter;

/**
 * ParseException : Mini Language 의 Syntax Error
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class ParseException extends Exception {
    public ParseException(String msg) {
        super(msg);
    }
}