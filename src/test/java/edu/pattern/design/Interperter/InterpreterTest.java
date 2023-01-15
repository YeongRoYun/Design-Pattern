package edu.pattern.design.Interperter;

import edu.pattern.design.Interpreter.example.SimpleExecutorFactory;
import edu.pattern.design.Interpreter.executor.ExecutorException;
import edu.pattern.design.Interpreter.executor.InterpreterFacade;
import edu.pattern.design.Interpreter.interpreter.ParseException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * InterpreterTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class InterpreterTest {
    @Test
    @DisplayName("Interpreter Main Test : Parse Syntax")
    void test() throws ParseException, ExecutorException {
        //given
        final var interpreter = new InterpreterFacade(new SimpleExecutorFactory());

        //when & then
        interpreter.parse("program repeat 4 repeat 5 go left end end right end");
        interpreter.execute();
    }
}