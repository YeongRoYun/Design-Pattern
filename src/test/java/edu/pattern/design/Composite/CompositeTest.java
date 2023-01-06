package edu.pattern.design.Composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * CompositeTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class CompositeTest {
    @Test
    @DisplayName("Composite Main Test")
    void test() {
        //given
        File file1 = new File("file1", 10);
        File file2 = new File("file2", 10);
        Directory directory = new Directory("directory", 0);

        //when
        directory.add(file1);
        directory.add(file2);

        //then
        assertThatThrownBy(() -> file1.add(file2)).isInstanceOf(FileTreatmentException.class);
        assertThat(file1.print("test")).isEqualTo("test/file1(10)");
        assertThat(directory.getSize()).isEqualTo(20);
        assertThat(directory.print("test")).isEqualTo("test/directory(20)\ntest/directory/file1(10)\ntest/directory/file2(10)\n");
    }
}