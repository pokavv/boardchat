package com.hello.boardchat.service.comment;

import com.hello.boardchat.domain.Comment;
import com.hello.boardchat.dto.CommentUpdateDto;
import com.hello.boardchat.repository.comment.CommentSearchCond;

import java.util.List;

public interface CommentService {

    Comment insertComment(Comment comment);

    void updateComment(Long commentId, CommentUpdateDto updateParam);

    Integer countComment(Comment comment);

    List<Comment> commentList(CommentSearchCond cond);

    void deleteComment(Long commentId);
}