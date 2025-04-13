package com.sparta.limited.user_service.domain.repository;

import com.sparta.limited.user_service.domain.model.User;

public interface UserRepository {

    void save(User user);

    boolean existsByUsername(String username);

    User findByUsername(String username);

}
