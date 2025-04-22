package com.sparta.limited.user_service.domain.exception;

import com.sparta.limited.common_module.exception.BusinessException;
import com.sparta.limited.common_module.exception.ErrorCode;

public class UserDuplicatedException extends BusinessException {

    public UserDuplicatedException(String username) {
        super(ErrorCode.DUPLICATE_RESOURCE, "이미 존재하는 사용자명입니다. 받은 사용자명 : " + username);
    }

}
