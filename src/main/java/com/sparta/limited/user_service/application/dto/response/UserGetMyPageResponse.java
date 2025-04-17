package com.sparta.limited.user_service.application.dto.response;

import com.sparta.limited.user_service.domain.model.Gender;
import com.sparta.limited.user_service.domain.model.UserRole;
import lombok.Getter;

@Getter
public class UserGetMyPageResponse {

    private final String username;
    private final UserRole role;
    private final Gender gender;
    private final Integer age;
    private final String address;

    private UserGetMyPageResponse(
        String username,
        UserRole role,
        Gender gender,
        Integer age,
        String address
    ) {
        this.username = username;
        this.role = role;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public static UserGetMyPageResponse of(
        String username,
        UserRole role,
        Gender gender,
        Integer age,
        String address
    ) {
        return new UserGetMyPageResponse(
            username,
            role,
            gender,
            age,
            address
        );
    }
}
