package com.hello.boardchat.config;

import com.hello.boardchat.repository.member.MemberMapper;
import com.hello.boardchat.repository.member.MemberRepository;
import com.hello.boardchat.repository.member.MemberRepositoryImpl;
import com.hello.boardchat.service.login.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class LoginConfig {

    private final MemberMapper memberMapper;

    @Bean
    LoginService loginService() {
        return new LoginService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepositoryImpl(memberMapper);
    }
}
