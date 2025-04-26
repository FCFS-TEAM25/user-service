package com.sparta.limited.user_service.domain.validator;

import com.sparta.limited.user_service.domain.exception.UserDuplicatedException;

public class UserDuplicatedValidator {

    public static void isDuplicated(
        boolean check,
        String username
    ) {
        if (check) {
            throw new UserDuplicatedException(username);
        }
    }

}
