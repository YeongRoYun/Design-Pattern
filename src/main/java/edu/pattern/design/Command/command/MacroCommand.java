package edu.pattern.design.Command.command;

import java.util.Stack;

/**
 * MacroCommand : 여려 명령을 저장하기 위해 사용. Composite Pattern 이 적용됨
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<>();

    @Override
    public String execute() {
        final var builder = new StringBuilder();
        for (final var command :
                commands) {
            builder.append(command.execute()).append("\n");
        }
        return builder.toString();
    }

    public void append(Command command) {
        this.commands.push(command);
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}