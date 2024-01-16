package com.rowoon.myblog.service;

import com.rowoon.myblog.domain.RefreshToken;
import com.rowoon.myblog.repository.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.ast.tree.from.StandardTableGroup;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}
