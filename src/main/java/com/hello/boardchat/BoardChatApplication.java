package com.hello.boardchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardChatApplication.class, args);
	}

	/**
	 * Spring boot 에서는 기존에 개발자가 직접 생성하고 생명주기를 관리해야했던
	 * SqlSessionFactory, SqlSession 등의 Mybatis 구성요소를 AutoConfiguration 으로 생성하고 관리해준다.
	 */
}
