package org.example.msbooks.repository;

import org.example.msbooks.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {

}
