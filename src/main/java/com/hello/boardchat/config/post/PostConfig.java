package com.hello.boardchat.config.post;

import com.hello.boardchat.repository.post.PostMapper;
import com.hello.boardchat.repository.post.PostRepository;
import com.hello.boardchat.repository.post.PostRepositoryImpl;
import com.hello.boardchat.service.post.PostService;
import com.hello.boardchat.service.post.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class PostConfig {

    private final PostMapper postMapper;

    @Bean
    public PostService postService() {
        return new PostServiceImpl(postRepository());
    }

    @Bean
    public PostRepository postRepository() {
        return new PostRepositoryImpl(postMapper);
    }
}
