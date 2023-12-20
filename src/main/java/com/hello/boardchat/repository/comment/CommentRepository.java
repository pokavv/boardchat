package com.hello.boardchat.repository.comment;

import com.hello.boardchat.domain.CommentRequest;
import com.hello.boardchat.domain.CommentResponse;
import com.hello.boardchat.dto.CommentUpdateDto;

import java.util.List;

public interface CommentRepository {

    CommentRequest insertComment(Long postId, CommentRequest commentRequest);

    void updateComment(Long commentId, CommentUpdateDto updateParam);

    CommentResponse commentFindById(Long postId);

    Integer countComment(CommentRequest commentRequest);

    List<CommentRequest> commentList(Long postId);

    void deleteComment(Long commentId);
}
