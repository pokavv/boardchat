package com.hello.boardchat.repository.member;

import com.hello.boardchat.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    Optional<Member> findByLoginId(String loginId);
}
