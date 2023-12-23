package com.hello.boardchat;

import com.hello.boardchat.config.LoginConfig;
import com.hello.boardchat.config.WebConfig;
import com.hello.boardchat.config.WebMvcConfig;
import com.hello.boardchat.config.chat.WebSocketConfig;
import com.hello.boardchat.config.comment.CommentConfig;
import com.hello.boardchat.config.file.FileConfig;
import com.hello.boardchat.config.post.PostConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Slf4j
@Import({PostConfig.class, CommentConfig.class, FileConfig.class, WebSocketConfig.class, WebConfig.class, WebMvcConfig.class, LoginConfig.class})
@SpringBootApplication(scanBasePackages = "com.hello.boardchat.controller")
public class BoardChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardChatApplication.class, args);
	}

	/**
	 * Spring boot 에서는 기존에 개발자가 직접 생성하고 생명주기를 관리해야했던
	 * SqlSessionFactory, SqlSession 등의 Mybatis 구성요소를 AutoConfiguration 으로 생성하고 관리해준다.
	 */
}
