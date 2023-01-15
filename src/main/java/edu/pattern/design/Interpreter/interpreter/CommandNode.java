package edu.pattern.design.Interpreter.interpreter;

import edu.pattern.design.Interpreter.executor.ExecutorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CommandNode : <Command> -> <Command> | <Repeat Command> | <Primitive Command> | <Command> <Command>
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class CommandNode implements Node {
    private List<Node> nodes = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (Objects.nonNull(context.getCurrentToken())) {
            if (context.getCurrentToken().equals("repeat")) {
                nodes.add(new RepeatCommandNode());
                nodes.get(nodes.size() - 1).parse(context);
            } else if (PrimitiveCommandNode.isValid(context.getCurrentToken())) {
                nodes.add(new PrimitiveCommandNode());
                nodes.get(nodes.size() - 1).parse(context);
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return nodes.toString();
    }

    @Override
    public void execute() throws ExecutorException {
        for (final var node :
                nodes) {
            node.execute();
        }
    }
}