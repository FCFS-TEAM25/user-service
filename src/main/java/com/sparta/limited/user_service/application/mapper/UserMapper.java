package com.sparta.limited.user_service.application.mapper;

import com.sparta.limited.user_service.domain.model.Gender;
import com.sparta.limited.user_service.domain.model.User;
import com.sparta.limited.user_service.infrastructure.dto.request.UserCreateFromAuthRequest;
import com.sparta.limited.user_service.infrastructure.dto.response.UserCreateFromAuthResponse;
import com.sparta.limited.user_service.infrastructure.dto.response.UserSearchUsernameResponse;

public class UserMapper {

    public static User toEntity(UserCreateFromAuthRequest request) {
        return User.of(request.getUsername(),
            request.getPassword(),
            Gender.from(request.getGender()),
            request.getAge(),
            request.getAddress());
    }

    public static UserCreateFromAuthResponse toResponse(User user) {
        return UserCreateFromAuthResponse.of(
            user.getId(),
            user.getUsername(),
            user.getRole(),
            user.getGender(),
            user.getAge(),
            user.getAddress()
        );
    }

    public static UserSearchUsernameResponse toSearchUsernameResponse(User user) {
        return UserSearchUsernameResponse.of(
            user.getId(),
            user.getUsername(),
            user.getPassword(),
            user.getRole(),
            user.getGender(),
            user.getAge(),
            user.getAddress()
        );
    }

}
