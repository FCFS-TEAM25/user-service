package com.sparta.limited.user_service.domain.model;

public enum Gender {

    FEMALE,
    MALE;

    public static Gender from(String gender) {
        return Gender.valueOf(gender);
    }
}
