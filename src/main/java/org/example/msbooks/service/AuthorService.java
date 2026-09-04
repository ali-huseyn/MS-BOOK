package org.example.msbooks.service;

import lombok.RequiredArgsConstructor;
import org.example.msbooks.dto.AuthorDtoResponse;
import org.example.msbooks.entity.AuthorEntity;
import org.example.msbooks.exception.AuthorNotFoundException;
import org.example.msbooks.exception.BookNotFoundException;
import org.example.msbooks.mapper.AuthorMapper;
import org.example.msbooks.repository.AuthorRepository;
import org.example.msbooks.repository.BookRepository;
import org.springframework.stereotype.Service;

import static org.example.msbooks.constant.ErrorMessages.AUTHOR_NOT_FOUND;
import static org.example.msbooks.constant.ErrorMessages.BOOK_NOT_FOUND;
import static org.example.msbooks.enums.AuthorStatus.INACTIVE;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public void addAuthor(AuthorDtoResponse response) {

        var entity = AuthorMapper.toAuthorEntity(response);

        authorRepository.save(entity);


    }


    public void deleteAuthor(Long id) {
        var foundEntity = fetchEntityIfExist(id);
        foundEntity.setStatus(INACTIVE);
        authorRepository.save(foundEntity);

    }

    public AuthorDtoResponse getAuthorById(Long id) {

        var entity = fetchEntityIfExist(id);

        var books = bookRepository.getBooksByAuthorId(entity.getId());

        return AuthorMapper.toAuthorDtoResponse(entity, books);
    }

    public void updateAuthor(Long id, AuthorDtoResponse response) {
        var foundEntity = fetchEntityIfExist(id);

        var entity = AuthorMapper.toAuthorEntity(response);

    }

    private AuthorEntity fetchEntityIfExist(Long id) {
        var foundEntity = authorRepository.findById(id);
        if (foundEntity.isEmpty()) {
            throw new AuthorNotFoundException(AUTHOR_NOT_FOUND);

        } else {
            return foundEntity.get();
        }
    }
}