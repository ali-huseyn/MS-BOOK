package org.example.msbooks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.boot.internal.Abstract;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "books")
@Entity

public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "genre")
    private String genre;
    @Column(name = "author_id")
    private String authorId;

}
