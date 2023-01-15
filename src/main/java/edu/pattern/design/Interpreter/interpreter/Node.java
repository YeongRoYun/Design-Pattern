package edu.pattern.design.Interpreter.interpreter;

import edu.pattern.design.Interpreter.executor.Executor;

/**
 * Node : BNF Syntax 의 Expression 역할
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public interface Node extends Executor {
    void parse(Context context) throws ParseException;
}
