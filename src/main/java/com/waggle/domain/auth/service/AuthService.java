package com.waggle.domain.auth.service;

import com.waggle.domain.auth.dto.AccessTokenResponse;
import com.waggle.domain.user.entity.User;

public interface AuthService {
    AccessTokenResponse reissueAccessToken(String refreshToken);
    String exchangeTemporaryToken(String temporaryToken);
    void deleteRefreshToken(String refreshToken);
}
