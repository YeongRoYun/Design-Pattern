package edu.pattern.design.Interpreter.executor;

/**
 * Executor : Parsing 된 언어를 실행
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public interface Executor {
    void execute() throws ExecutorException;
}