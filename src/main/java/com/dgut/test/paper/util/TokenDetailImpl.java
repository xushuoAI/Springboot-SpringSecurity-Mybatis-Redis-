package com.dgut.test.paper.util;

import com.dgut.test.paper.util.inter.TokenDetail;

public class TokenDetailImpl implements TokenDetail {
    private final String username;

    public TokenDetailImpl(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return this.username;
    }
}
