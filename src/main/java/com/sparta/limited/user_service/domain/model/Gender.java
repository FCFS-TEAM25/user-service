package com.sparta.limited.user_service.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {

    FEMALE("여성"),
    MALE("남성");

    private final String description;

    public static Gender from(String gender) {
        return Gender.valueOf(gender);
    }

}
