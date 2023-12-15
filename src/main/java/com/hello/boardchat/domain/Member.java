package com.hello.boardchat.domain;

import lombok.Data;

@Data
public class Member {

    private Long memberId;
    private String loginId;
    private String loginPw;

    public Member() {}

    public Member(String loginId, String loginPw) {
        this.loginId = loginId;
        this.loginPw = loginPw;
    }
}