package edu.pattern.design.Iterator;

/**
 * BookShelf
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class BookShelf implements Aggregate {
    private final Book[] books;
    private int last;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
        this.last = 0;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public Book getBookAt(int index) throws IndexOutOfBoundsException {
        if (index < books.length) {
            return books[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void appendBook(Book book) throws OutOfMemoryError {
        if (last < books.length) {
            books[last++] = book;
        } else {
            throw new OutOfMemoryError();
        }
    }

    public int getLength() {
        return last;
    }
}