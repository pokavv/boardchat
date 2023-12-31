package com.hello.boardchat.controller;

import com.hello.boardchat.domain.CommentRequest;
import com.hello.boardchat.domain.CommentResponse;
import com.hello.boardchat.service.comment.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping("/posts/{postId}/comments")
    public List<CommentRequest> comments(@PathVariable Long postId) {
        return commentService.commentList(postId);
    }

    @PostMapping("/posts/{postId}/comments")
    public CommentResponse saveComment(@PathVariable Long postId,
                                      @RequestBody CommentRequest params) {
        log.info("[POST] params={}", params);
        CommentRequest comment = commentService.insertComment(postId, params);
        Long commentId = comment.getCommentId();
        return commentService.commentFindById(commentId);
    }
}
