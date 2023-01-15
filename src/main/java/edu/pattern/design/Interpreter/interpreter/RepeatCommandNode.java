package edu.pattern.design.Interpreter.interpreter;

import edu.pattern.design.Interpreter.executor.ExecutorException;

/**
 * RepeatCommandNode : <Repeat Command> -> repeat <number> <Command> end
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class RepeatCommandNode implements Node {
    private int number;
    private Node command;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        command = new CommandNode();
        command.parse(context);
        context.skipToken("end");
    }

    @Override
    public String toString() {
        return "repeat " + number + " " + command + " end";
    }

    @Override
    public void execute() throws ExecutorException {
        for (int i = 0; i < number; i++) {
            command.execute();
        }
    }
}