package com.hello.boardchat.service.post;

import com.hello.boardchat.domain.Post;
import com.hello.boardchat.dto.PostUpdateDto;
import com.hello.boardchat.repository.post.PostRepository;
import com.hello.boardchat.repository.post.PostSearchCond;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void update(Long postId, PostUpdateDto updateParam) {
        postRepository.update(postId, updateParam);
    }

    @Override
    public Optional<Post> findById(Long postId) {
        return postRepository.findById(postId);
    }

    @Override
    public List<Post> findAll(PostSearchCond cond) {
        return postRepository.findAll(cond);
    }

    @Override
    public void delete(Long postId) {
        postRepository.delete(postId);
    }
}
