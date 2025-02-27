package com.wipro.java.ms.o;

import java.util.List;

public interface DatabasePersistence {
    void save(Book book);
    List<Book> getAllBooks();
}