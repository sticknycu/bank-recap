package ro.pao.gateways;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import ro.pao.mappers.BookMapper;
import ro.pao.model.Book;
import ro.pao.service.BookService;
import ro.pao.service.ClientService;
import ro.pao.service.impl.BookServiceImpl;
import ro.pao.service.impl.ClientServiceImpl;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requests {

    private static HttpClient httpClient = HttpClient.newHttpClient();

    private static ObjectMapper objectMapper = new ObjectMapper();

    private static BookMapper bookMapper = new BookMapper();

    private static BookService bookService = new BookServiceImpl();

    public void saveRequestInfo() {
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(new URI("https://wizard-world-api.herokuapp.com/Elixirs/0106fb32-b00d-4d70-9841-4b7c2d2cca71"))
                    .GET()
                    .build();

            var httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            Book book = bookMapper.bookMapper(objectMapper, httpResponse.body());

            bookService.saveBook(book);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
