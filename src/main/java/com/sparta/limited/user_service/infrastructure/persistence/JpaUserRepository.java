package com.sparta.limited.user_service.infrastructure.persistence;

import com.sparta.limited.user_service.domain.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);
}
