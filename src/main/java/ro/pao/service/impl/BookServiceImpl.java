package ro.pao.service.impl;


import ro.pao.model.Book;
import ro.pao.service.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private static List<Book> bookList = new ArrayList<>();


    @Override
    public void saveBook(Book book) {
        bookList.add(book);
    }

    @Override
    public void printBooks() {
        bookList.forEach(System.out::println);
    }
}
