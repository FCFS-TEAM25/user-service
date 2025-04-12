package com.sparta.limited.user_service.presentation.internal.controller;

import com.sparta.limited.user_service.application.service.UserService;
import com.sparta.limited.user_service.infrastructure.dto.request.UserCreateFromAuthRequest;
import com.sparta.limited.user_service.infrastructure.dto.response.UserCreateFromAuthResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/internal/users")
@Slf4j
public class UserInternalController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<UserCreateFromAuthResponse> createUser(
        @RequestBody UserCreateFromAuthRequest request) {
        UserCreateFromAuthResponse response = userService.createUser(request);
        return ResponseEntity.ok(response);
    }

}
