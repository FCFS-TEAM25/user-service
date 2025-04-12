package com.sparta.limited.user_service.domain.model;

public enum UserRole {

    ROLE_ADMIN,
    ROLE_USER;

    public static UserRole from(String role) {
        return UserRole.valueOf(role);
    }

}
