package org.example.msbooks.mapper;

import org.example.msbooks.dto.BookDtoResponse;
import org.example.msbooks.entity.BookEntity;

import java.awt.print.Book;

public interface BookMapper {
    static BookDtoResponse toBookDtoResponse(BookEntity bookEntity) {
        BookDtoResponse bookDtoResponse = new BookDtoResponse();
        bookDtoResponse.setName(bookEntity.getName());
        bookDtoResponse.setGenre(bookEntity.getGenre());
        return bookDtoResponse;

    }
}
