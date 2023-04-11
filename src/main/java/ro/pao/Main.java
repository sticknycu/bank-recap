package ro.pao;

import ro.pao.application.Menu;
import ro.pao.gateways.Requests;
import ro.pao.service.BookService;
import ro.pao.service.impl.BookServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu menu = Menu.getInstance();

            menu.intro();

            if ("exit".equals(scanner.next())) {
                break;
            }
        }*/

        Requests requests = new Requests();
        requests.saveRequestInfo();

        BookService bookService = new BookServiceImpl();

        bookService.printBooks();
    }
}
