package com.hello.boardchat.service.comment;

import com.hello.boardchat.domain.Comment;
import com.hello.boardchat.dto.CommentUpdateDto;
import com.hello.boardchat.repository.comment.CommentRepository;
import com.hello.boardchat.repository.comment.CommentSearchCond;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public Comment insertComment(Comment comment) {
        return commentRepository.insertComment(comment);
    }

    @Override
    public void updateComment(Long commentId, CommentUpdateDto updateParam) {
        commentRepository.updateComment(commentId, updateParam);
    }

    @Override
    public Integer countComment(Comment comment) {
        return commentRepository.countComment(comment);
    }

    @Override
    public List<Comment> commentList(CommentSearchCond cond) {
        return commentRepository.commentList(cond);
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteComment(commentId);
    }
}
