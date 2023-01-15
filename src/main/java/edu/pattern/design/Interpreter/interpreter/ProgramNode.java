package edu.pattern.design.Interpreter.interpreter;

import edu.pattern.design.Interpreter.executor.ExecutorException;

/**
 * ProgramNode : <program> -> program <command> end
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class ProgramNode implements Node {
    private Node command;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        command = new CommandNode();
        command.parse(context);
        context.skipToken("end");
    }

    @Override
    public String toString() {
        return "[program " + command + " end]";
    }

    @Override
    public void execute() throws ExecutorException {
        this.command.execute();
    }
}