package org.example.msbooks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.msbooks.enums.AuthorStatus;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "authors")
@Entity

public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "nationality")
    private String nationality;
    @Enumerated(EnumType.STRING)
    private AuthorStatus status;

}
