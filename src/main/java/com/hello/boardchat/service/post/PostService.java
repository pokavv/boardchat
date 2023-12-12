package com.hello.boardchat.service.post;

import com.hello.boardchat.domain.Post;
import com.hello.boardchat.dto.PostUpdateDto;
import com.hello.boardchat.repository.post.PostSearchCond;

import java.util.List;
import java.util.Optional;

public interface PostService {

    Post save(Post post);

    void update(Long postId, PostUpdateDto updateParam);

    Optional<Post> findById(Long postId);

    List<Post> findAll(PostSearchCond cond);

    void delete(Long postId);
}
