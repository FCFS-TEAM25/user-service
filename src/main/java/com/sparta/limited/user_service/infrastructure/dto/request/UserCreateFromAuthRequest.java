package com.sparta.limited.user_service.infrastructure.dto.request;

import lombok.Getter;

@Getter
public class UserCreateFromAuthRequest {

    private String username;
    private String password;
    private String gender;
    private Integer age;
    private String address;
}
