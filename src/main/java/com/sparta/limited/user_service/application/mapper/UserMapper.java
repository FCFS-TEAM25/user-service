package com.sparta.limited.user_service.application.mapper;

import com.sparta.limited.user_service.domain.model.Gender;
import com.sparta.limited.user_service.domain.model.User;
import com.sparta.limited.user_service.infrastructure.dto.request.UserCreateFromAuthRequest;
import com.sparta.limited.user_service.infrastructure.dto.response.UserCreateFromAuthResponse;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserCreateFromAuthRequest request) {
        return User.of(request.getUsername(),
            request.getPassword(),
            Gender.from(request.getGender()),
            request.getAge(),
            request.getAddress());
    }

    public UserCreateFromAuthResponse toResponse(User user) {
        return new UserCreateFromAuthResponse(user.getId(),
            user.getUsername(),
            user.getRole().toString(),
            user.getGender().toString(),
            user.getAge(),
            user.getAddress());
    }

}
