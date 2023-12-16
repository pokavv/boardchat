package com.hello.boardchat.repository.comment;

import com.hello.boardchat.domain.Comment;
import com.hello.boardchat.dto.CommentUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommentRepositoryImpl implements CommentRepository {

    private final CommentMapper commentMapper;

    @Override
    public Comment insertComment(Comment comment) {
        comment.setCommentDate(LocalDateTime.now());
        commentMapper.insertComment(comment);
        return comment;
    }

    @Override
    public void updateComment(Long commentId, CommentUpdateDto updateParam) {
        commentMapper.updateComment(commentId, updateParam);
    }

    @Override
    public Integer countComment(Comment comment) {
        return commentMapper.countComment(comment);
    }

    @Override
    public List<Comment> commentList(CommentSearchCond cond) {
        return commentMapper.commentList(cond);
    }

    @Override
    public void deleteComment(Long commentId) {
        commentMapper.deleteComment(commentId);
    }
}
