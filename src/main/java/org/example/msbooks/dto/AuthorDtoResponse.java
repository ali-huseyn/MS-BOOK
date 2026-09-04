package org.example.msbooks.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msbooks.enums.AuthorStatus;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthorDtoResponse {
    private Long id;
    private String name;
    private String surname;
    private String nationality;
    private AuthorStatus status;
    private List<BookDtoResponse>books;
}
