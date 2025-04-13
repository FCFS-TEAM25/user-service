package com.sparta.limited.user_service.application.service;

import com.sparta.limited.common_module.exception.BusinessException;
import com.sparta.limited.common_module.exception.ErrorCode;
import com.sparta.limited.user_service.application.mapper.UserMapper;
import com.sparta.limited.user_service.domain.model.User;
import com.sparta.limited.user_service.domain.repository.UserRepository;
import com.sparta.limited.user_service.infrastructure.dto.request.UserCreateFromAuthRequest;
import com.sparta.limited.user_service.infrastructure.dto.response.UserCreateFromAuthResponse;
import com.sparta.limited.user_service.infrastructure.dto.response.UserSearchUsernameResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserCreateFromAuthResponse createUser(UserCreateFromAuthRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new BusinessException(ErrorCode.DUPLICATE_RESOURCE);
        }
        User user = UserMapper.toEntity(request);
        userRepository.save(user);
        return UserMapper.toResponse(user);
    }

    @Transactional(readOnly = true)
    public UserSearchUsernameResponse searchUserFromUsername(String username) {
        User user = userRepository.findByUsername(username);
        return UserMapper.toSearchUsernameResponse(user);
    }

}
