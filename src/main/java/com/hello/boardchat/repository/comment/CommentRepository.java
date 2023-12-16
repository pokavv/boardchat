package com.hello.boardchat.repository.comment;

import com.hello.boardchat.domain.Comment;
import com.hello.boardchat.dto.CommentUpdateDto;

import java.util.List;

public interface CommentRepository {

    Comment insertComment(Comment comment);

    void updateComment(Long commentId, CommentUpdateDto updateParam);

    Integer countComment(Comment comment);

    List<Comment> commentList(CommentSearchCond cond);

    void deleteComment(Long commentId);
}
