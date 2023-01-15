package edu.pattern.design.Interpreter.example;

import edu.pattern.design.Interpreter.executor.Executor;
import edu.pattern.design.Interpreter.executor.ExecutorFactory;

/**
 * SimpleExecutorFactory
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class SimpleExecutorFactory implements ExecutorFactory {
    @Override
    public Executor createExecutor(String name) {
        return new SimpleExecutor(name);
    }
}