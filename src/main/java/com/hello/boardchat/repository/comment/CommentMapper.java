package com.hello.boardchat.repository.comment;

import com.hello.boardchat.domain.CommentRequest;
import com.hello.boardchat.domain.CommentResponse;
import com.hello.boardchat.dto.CommentUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentMapper {

    int countComment(CommentRequest commentRequest);

    List<CommentRequest> commentList(Long postId);

    CommentResponse commentFindById(Long commentId);

    void insertComment(@Param("postId") Long postId,
                       @Param("commentRequest") CommentRequest commentRequest);

    void updateComment(@Param("commentId") Long commentId,
                       @Param("updateParam") CommentUpdateDto updateParam);

    void deleteComment(Long commentId);
}
