package edu.pattern.design.Interpreter.executor;

import edu.pattern.design.Interpreter.interpreter.Context;
import edu.pattern.design.Interpreter.interpreter.Node;
import edu.pattern.design.Interpreter.interpreter.ParseException;
import edu.pattern.design.Interpreter.interpreter.ProgramNode;

import java.util.Objects;

/**
 * InterpreterFacade
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class InterpreterFacade implements Executor {
    private ExecutorFactory factory;
    private Context context;
    private Node programNode;

    public InterpreterFacade(ExecutorFactory factory) {
        this.factory = factory;
    }

    public void parse(String text) throws ParseException {
        this.context = new Context(text);
        this.context.setExecutorFactory(this.factory);
        this.programNode = new ProgramNode();
        this.programNode.parse(this.context);

        System.out.println(programNode);
    }

    @Override
    public void execute() throws ExecutorException {
        if (Objects.isNull(programNode)) {
            throw new ExecutorException("Warning: Empty Program");
        } else {
            programNode.execute();
        }
    }
}