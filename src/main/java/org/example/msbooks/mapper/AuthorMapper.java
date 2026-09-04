package org.example.msbooks.mapper;

import org.example.msbooks.dto.AuthorDtoResponse;
import org.example.msbooks.entity.AuthorEntity;
import org.example.msbooks.entity.BookEntity;

import java.util.List;

public interface AuthorMapper {

    static AuthorEntity toAuthorEntity(AuthorDtoResponse authorDtoResponse) {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setName(authorDtoResponse.getName());
        authorEntity.setSurname(authorDtoResponse.getSurname());
        authorEntity.setNationality(authorDtoResponse.getNationality());
        authorEntity.setStatus(authorDtoResponse.getStatus());
        return authorEntity;
    }


    static AuthorDtoResponse toAuthorDtoResponse(AuthorEntity authorEntity, List<BookEntity> bookEntitys) {
        AuthorDtoResponse authorDtoResponse = new AuthorDtoResponse();
        authorDtoResponse.setId(authorEntity.getId());
        authorDtoResponse.setName(authorEntity.getName());
        authorDtoResponse.setSurname(authorEntity.getSurname());
        authorDtoResponse.setNationality(authorEntity.getNationality());
        authorDtoResponse.setBooks(
                bookEntitys.stream()
                        .map(BookMapper::toBookDtoResponse)
                        .toList()
        );
        return authorDtoResponse;
    }





}
