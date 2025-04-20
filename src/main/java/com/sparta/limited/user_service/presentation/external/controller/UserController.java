package com.sparta.limited.user_service.presentation.external.controller;

import com.sparta.limited.common_module.common.annotation.CurrentUserId;
import com.sparta.limited.user_service.application.dto.response.UserGetMyPageResponse;
import com.sparta.limited.user_service.application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/my-page")
    public ResponseEntity<UserGetMyPageResponse> getMyPage(
        @CurrentUserId Long userId
    ) {
        UserGetMyPageResponse response = userService.getMyPage(userId);
        return ResponseEntity.ok(response);
    }
}
