package com.sparta.limited.user_service.infrastructure.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserCreateFromAuthResponse {

    private final Long userId;
    private final String username;
    private final String role;
    private final String gender;
    private final Integer age;
    private final String address;
}
