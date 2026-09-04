package org.example.msbooks.repository;

import org.example.msbooks.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {
    List<BookEntity> getBooksByAuthorId(Long id);
}
