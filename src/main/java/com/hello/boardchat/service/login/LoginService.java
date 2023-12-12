package com.hello.boardchat.service.login;

import com.hello.boardchat.domain.Member;
import com.hello.boardchat.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    /**
     * @param loginId
     * @param loginPw
     * @return
     */
    public Member login(String loginId, String loginPw) {
        return memberRepository.findByLoginId(loginId)
                .filter(member -> member.getLoginPw().equals(loginPw))
                .orElse(null);
    }
}
