package com.hello.boardchat.repository.post;

import com.hello.boardchat.domain.Post;
import com.hello.boardchat.dto.PostUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepository {

    // postMapper 에 기능 위임
    private final PostMapper postMapper;

    @Override
    public Post save(Post post) {
        post.setPostDate(LocalDateTime.now());
        postMapper.save(post);
        return post;
    }

    @Override
    public void update(Long postId, PostUpdateDto updateParam) {
        postMapper.update(postId, updateParam);
    }

    @Override
    public Optional<Post> findById(Long postId) {
        return postMapper.findById(postId);
    }

    @Override
    public List<Post> findAll(PostSearchCond cond) {
        return postMapper.findAll(cond);
    }

    @Override
    public void delete(Long postId) {
        postMapper.delete(postId);
    }
}
