package com.hello.boardchat.service.comment;

import com.hello.boardchat.domain.CommentRequest;
import com.hello.boardchat.domain.CommentResponse;
import com.hello.boardchat.dto.CommentUpdateDto;
import com.hello.boardchat.repository.comment.CommentSearchCond;

import java.util.List;

public interface CommentService {

    CommentResponse commentFindById(Long commentId);

    CommentRequest insertComment(Long postId, CommentRequest commentRequest);

    void updateComment(Long commentId, CommentUpdateDto updateParam);

    Integer countComment(CommentRequest commentRequest);

    List<CommentRequest> commentList(CommentSearchCond cond);

    void deleteComment(Long commentId);
}