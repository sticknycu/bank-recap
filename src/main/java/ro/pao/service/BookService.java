package ro.pao.service;

import ro.pao.model.Book;

public interface BookService {

    void saveBook(Book book);

    void printBooks();
}
