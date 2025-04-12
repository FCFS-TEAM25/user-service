package com.sparta.limited.user_service.infrastructure.repository;

import com.sparta.limited.user_service.domain.model.User;
import com.sparta.limited.user_service.domain.repository.UserRepository;
import com.sparta.limited.user_service.infrastructure.persistence.JpaUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final JpaUserRepository jpaUserRepository;

    @Override
    public void save(User user) {
        jpaUserRepository.save(user);
    }

    @Override
    public boolean existsByUsername(String username) {
        return jpaUserRepository.existsByUsername(username);
    }

}
