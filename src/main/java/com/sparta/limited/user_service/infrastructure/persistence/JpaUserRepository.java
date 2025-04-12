package com.sparta.limited.user_service.infrastructure.persistence;

import com.sparta.limited.user_service.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);
}
