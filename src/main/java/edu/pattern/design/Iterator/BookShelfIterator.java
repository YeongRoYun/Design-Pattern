package edu.pattern.design.Iterator;

/**
 * BookShelfIterator
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class BookShelfIterator implements Iterator {
    private final BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        if (index < bookShelf.getLength()) {
            return bookShelf.getBookAt(index++);
        } else {
            return null;
        }
    }
}