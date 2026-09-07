package org.example.msbooks.dto;

import jakarta.persistence.Column;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookDtoResponse {

    private String name;
    private String genre;
}
