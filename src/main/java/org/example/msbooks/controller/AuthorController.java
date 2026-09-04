package org.example.msbooks.controller;

import lombok.RequiredArgsConstructor;
import org.example.msbooks.dto.AuthorDtoResponse;
import org.example.msbooks.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void addAuthors(@RequestBody AuthorDtoResponse authorDtoResponse) {

        authorService.addAuthor(authorDtoResponse);

    }

    @DeleteMapping("/{authorId}")
    @ResponseStatus(NO_CONTENT)

    public void deleteAuthors(@PathVariable Long authorId) {
        authorService.deleteAuthor(authorId);
    }

    @GetMapping("/{id}")
    public AuthorDtoResponse getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);

    }
}
