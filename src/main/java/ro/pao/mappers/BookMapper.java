package ro.pao.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import ro.pao.model.Book;


public class BookMapper {

    public Book bookMapper(ObjectMapper objectMapper, String body) throws JsonProcessingException {
        JsonNode jsonNode = objectMapper.readTree(body);

        Book book = new Book();

        book.setId(jsonNode.get("id").asText());
        book.setEffect(jsonNode.get("effect").asText());
        book.setName(jsonNode.get("name").asText());

        return book;
    }
}
