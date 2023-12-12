package com.hello.boardchat.repository.post;

import com.hello.boardchat.domain.Post;
import com.hello.boardchat.dto.PostUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {

    void save(Post post);

    void update(@Param("postId") Long postId,
                @Param("updateParam")PostUpdateDto updateParam);

    Optional<Post> findById(Long postId);

    List<Post> findAll(PostSearchCond cond);

    void delete(Long postId);
}
