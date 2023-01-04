package edu.pattern.design.Iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * IteratorTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class IteratorTest {
    @Test
    @DisplayName("Iterator Main Test")
    void test() {
        //given
        final var names = new String[]{"Network Introduction", "Clean Code", "Mordern C++"};
        final var bookShelf = new BookShelf(10);
        Arrays.stream(names).forEach(name -> bookShelf.appendBook(new Book(name)));

        //when & then
        Iterator iter = bookShelf.iterator();
        var index = 0;
        while(iter.hasNext()) {
            final var book = (Book)iter.next();
            assertThat(book).as("name : %s", book.name()).isEqualTo(bookShelf.getBookAt(index++));
        }
    }
}