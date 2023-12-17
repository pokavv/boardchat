package com.hello.boardchat.config.comment;

import com.hello.boardchat.repository.comment.CommentMapper;
import com.hello.boardchat.repository.comment.CommentRepository;
import com.hello.boardchat.repository.comment.CommentRepositoryImpl;
import com.hello.boardchat.service.comment.CommentService;
import com.hello.boardchat.service.comment.CommentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CommentConfig {

    private final CommentMapper commentMapper;

    @Bean
    public CommentService commentService() {
        return new CommentServiceImpl(commentRepository());
    }

    @Bean
    public CommentRepository commentRepository() {
        return new CommentRepositoryImpl(commentMapper);
    }
}
