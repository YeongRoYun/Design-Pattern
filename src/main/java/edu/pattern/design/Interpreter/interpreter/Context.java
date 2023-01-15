package edu.pattern.design.Interpreter.interpreter;

import edu.pattern.design.Interpreter.executor.Executor;
import edu.pattern.design.Interpreter.executor.ExecutorFactory;
import lombok.Getter;
import lombok.Setter;

import java.util.StringTokenizer;

/**
 * Context : Node 를 해석하기 위한 맥락 정보
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class Context implements ExecutorFactory {
    private StringTokenizer tokenizer;
    @Setter
    private ExecutorFactory executorFactory;
    @Getter
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException(String.format("Warning: %s is expected, but %s is found", token, currentToken));
        } else {
            nextToken();
        }
    }

    public int currentNumber() throws ParseException {
        try {
            return Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }
    }

    @Override
    public Executor createExecutor(String name) {
        return executorFactory.createExecutor(name);
    }
}