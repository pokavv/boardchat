package com.hello.boardchat.repository.member;

import com.hello.boardchat.domain.Member;

import java.util.Optional;

public interface MemberRepository {

      Optional<Member> findByLoginId(String loginId);
}
