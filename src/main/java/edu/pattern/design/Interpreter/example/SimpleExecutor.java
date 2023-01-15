package edu.pattern.design.Interpreter.example;

import edu.pattern.design.Interpreter.executor.Executor;
import edu.pattern.design.Interpreter.executor.ExecutorException;

/**
 * SimpleExecutor
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
**/
public class SimpleExecutor implements Executor {
    private String name;
    public SimpleExecutor(String name) {
        this.name = name;
    }
    @Override
    public void execute() throws ExecutorException {
        if(name.equals("go")) {
            System.out.println("go");
        } else if(name.equals("left")) {
            System.out.println("left");
        } else if(name.equals("right")) {
            System.out.println("right");
        } else {
            throw new ExecutorException("Warning: " + name + " is not defined");
        }
    }
}