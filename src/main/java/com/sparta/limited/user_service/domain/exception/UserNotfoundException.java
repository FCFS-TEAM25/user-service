package com.sparta.limited.user_service.domain.exception;

import com.sparta.limited.common_module.exception.BusinessException;
import com.sparta.limited.common_module.exception.ErrorCode;

public class UserNotfoundException extends BusinessException {

    public UserNotfoundException(Long userid) {
        super(ErrorCode.RESOURCES_NOT_FOUND, "요청하신 userId 에 해당하는 사용자가 없습니다. 받은 userId : " + userid);
    }

    public UserNotfoundException(String username) {
        super(ErrorCode.RESOURCES_NOT_FOUND,
            " 요청하신 username 에 해당하는 사용자가 없습니다. 받은 username : " + username);
    }

}
