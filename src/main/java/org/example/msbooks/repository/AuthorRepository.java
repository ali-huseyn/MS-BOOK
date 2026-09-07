package org.example.msbooks.repository;

import org.example.msbooks.entity.AuthorEntity;
import org.example.msbooks.enums.AuthorStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {

    Optional<AuthorEntity> findByIdAndStatus(Long id, AuthorStatus status);


}
