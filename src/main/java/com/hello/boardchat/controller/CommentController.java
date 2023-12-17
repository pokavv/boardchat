package com.hello.boardchat.controller;

import com.hello.boardchat.domain.Comment;
import com.hello.boardchat.repository.comment.CommentSearchCond;
import com.hello.boardchat.service.comment.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping
    public String comments(@ModelAttribute("commentSearchCond")CommentSearchCond cond,
                           Model model) {
        List<Comment> comments = commentService.commentList(cond);
        model.addAttribute("comments", comments);
        log.info("comments={}", comments);
        return "comments";
    }
}
