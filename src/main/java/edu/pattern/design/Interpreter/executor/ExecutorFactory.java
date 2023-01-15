package edu.pattern.design.Interpreter.executor;

/**
 * ExecutorFactory
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public interface ExecutorFactory {
    Executor createExecutor(String name);
}