package com.hello.boardchat.config.chat;

import com.hello.boardchat.controller.ChatHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
@RequiredArgsConstructor
public class WebSocketConfig implements WebSocketConfigurer {

    private final ChatHandler chatHandler;

    /**
     * ws://~ 로 webSocket protocol request 시작
     * addHandler(chatHandler, "ws/chat") : /chat 을 endpoint 로 설정
     * .setAllowedOriginPatterns("*") : domain 이 다른 server 에 접속 가능하도록 설정
     **/
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(chatHandler, "ws/chat")
                .setAllowedOriginPatterns("*");
    }
}