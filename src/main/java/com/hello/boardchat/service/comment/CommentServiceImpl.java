package com.hello.boardchat.service.comment;

import com.hello.boardchat.domain.CommentRequest;
import com.hello.boardchat.domain.CommentResponse;
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
    public CommentResponse commentFindById(Long commentId) {
        return commentRepository.commentFindById(commentId);
    }

    @Override
    public CommentRequest insertComment(Long postId, CommentRequest commentRequest) {
        return commentRepository.insertComment(postId, commentRequest);
    }

    @Override
    public void updateComment(Long commentId, CommentUpdateDto updateParam) {
        commentRepository.updateComment(commentId, updateParam);
    }

    @Override
    public Integer countComment(CommentRequest commentRequest) {
        return commentRepository.countComment(commentRequest);
    }

    @Override
    public List<CommentRequest> commentList(CommentSearchCond cond) {
        return commentRepository.commentList(cond);
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteComment(commentId);
    }
}
