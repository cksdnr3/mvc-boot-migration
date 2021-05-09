package com.example.api.user.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum Role implements GrantedAuthority {
    ADMIN("ROLE_ADMIN", "관리자 권한"),
    USER("ROLE_USER", "사용자 권한"),
    UNKNOWN("ROLE_UNKNOWN", "알 수 없는 권한");

    private final String role;
    private final String message;

    public static Role of(String role) {
        return Arrays.stream(Role.values())
                .filter(i -> i.getRole() == role)
                .findAny()
                .orElse(UNKNOWN);
    }

    @Override
    public String getAuthority() {
        return name();
    }
}
