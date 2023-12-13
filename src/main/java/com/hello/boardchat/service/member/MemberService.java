package com.hello.boardchat.service.member;

import com.hello.boardchat.domain.Member;

import java.util.Optional;

public interface MemberService {

    Optional<Member> findByLoginId(String loginId);
}
