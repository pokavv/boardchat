package com.hello.boardchat.repository.comment;

import com.hello.boardchat.domain.CommentRequest;
import com.hello.boardchat.domain.CommentResponse;
import com.hello.boardchat.dto.CommentUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommentRepositoryImpl implements CommentRepository {

    private final CommentMapper commentMapper;

    @Override
    @Transactional
    public CommentRequest insertComment(Long postId, CommentRequest commentRequest) {
        commentRequest.setCommentDate(LocalDateTime.now());
        commentRequest.setPostId(postId);
        commentMapper.insertComment(postId, commentRequest);
        return commentRequest;
    }

    @Override
    @Transactional
    public void updateComment(Long commentId, CommentUpdateDto updateParam) {
        commentMapper.updateComment(commentId, updateParam);
    }

    @Override
    public CommentResponse commentFindById(Long postId) {
        return commentMapper.commentFindById(postId);
    }

    @Override
    public Integer countComment(CommentRequest commentRequest) {
        return commentMapper.countComment(commentRequest);
    }

    @Override
    public List<CommentRequest> commentList(Long postId) {
        return commentMapper.commentList(postId);
    }

    @Override
    @Transactional
    public void deleteComment(Long commentId) {
        commentMapper.deleteComment(commentId);
    }
}
