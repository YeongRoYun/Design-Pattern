package edu.pattern.design.Interpreter.interpreter;

import edu.pattern.design.Interpreter.executor.Executor;
import edu.pattern.design.Interpreter.executor.ExecutorException;

import java.util.Objects;
import java.util.Set;

/**
 * PrimitiveCommandNode : <Primitive Command> -> go | right | left
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class PrimitiveCommandNode implements Node {
    private String name;
    private Executor executor;
    private static Set<String> primitives = Set.of("go", "left", "right");

    public static boolean isValid(String currentToken) {
        return primitives.contains(currentToken);
    }

    @Override
    public void parse(Context context) throws ParseException {
        name = context.getCurrentToken();
        context.skipToken(name);
        if (!primitives.contains(name)) {
            throw new ParseException("Warning: " + name + " is undefined");
        }
        executor = context.createExecutor(name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void execute() throws ExecutorException {
        if (Objects.isNull(executor)) {
            throw new ExecutorException("Warning: " + name + "is not defined");
        } else {
            executor.execute();
        }
    }
}