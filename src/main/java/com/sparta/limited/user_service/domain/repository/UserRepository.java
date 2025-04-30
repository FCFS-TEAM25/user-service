package com.sparta.limited.user_service.domain.repository;

import com.sparta.limited.user_service.domain.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserRepository {

    void save(User user);

    boolean existsByUsername(String username);

    User findByUsername(String username);

    User findById(Long userId);

    Page<User> findAll(Pageable pageable);
}
