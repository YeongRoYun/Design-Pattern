package edu.pattern.design.Visitor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * VisitorTest
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
**/
public class VisitorTest {
    @Test
    @DisplayName("Visitor Main Test")
    void test() throws FileTreatmentException {
        //given
        final Entity file1 = new File("file1", 10);
        final Entity file2 = new File("file2", 10);
        final Entity directory = new Directory("directory", 0);
        directory.add(file1);
        directory.add(file2);

        final Visitor visitor = new ListVisitor();
        //when & then
        assertThat(directory.accept(visitor)).isEqualTo("/directory(20)\n/directory/file1(10)\n/directory/file2(10)\n");
    }
}