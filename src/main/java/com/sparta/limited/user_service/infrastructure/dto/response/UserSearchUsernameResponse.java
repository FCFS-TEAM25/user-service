package com.sparta.limited.user_service.infrastructure.dto.response;

import lombok.Getter;

@Getter
public class UserSearchUsernameResponse {

    private final Long userId;
    private final String username;
    private final String role;
    private final String gender;
    private final Integer age;
    private final String address;

    private UserSearchUsernameResponse(Long userId, String username, String role,
        String gender,
        Integer age, String address) {
        this.userId = userId;
        this.username = username;
        this.role = role;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public static UserSearchUsernameResponse of(Long userId, String username, String role,
        String gender,
        Integer age, String address) {
        return new UserSearchUsernameResponse(
            userId,
            username,
            role,
            gender,
            age,
            address
        );
    }
}
