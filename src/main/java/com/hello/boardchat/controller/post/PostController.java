package com.hello.boardchat.controller.post;

import com.hello.boardchat.domain.FileRequest;
import com.hello.boardchat.domain.Post;
import com.hello.boardchat.dto.PostUpdateDto;
import com.hello.boardchat.repository.file.FileUtils;
import com.hello.boardchat.repository.post.PostSearchCond;
import com.hello.boardchat.service.file.FileService;
import com.hello.boardchat.service.post.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final FileService fileService;
    private final FileUtils fileUtils;

    @GetMapping
    public String posts(@ModelAttribute("postSearchCond")PostSearchCond cond,
                        Model model) {
        List<Post> posts = postService.findAll(cond);
        model.addAttribute("posts", posts);
        log.info("posts={}", posts);
        return "posts";
    }

    @GetMapping("/{postId}")
    public String post(@PathVariable Long postId, Model model) {
        Post post = postService.findById(postId).get();
        model.addAttribute("post", post);
        log.info("post={}", post);
        return "post";
    }

    @GetMapping("/add")
    public String addForm() {
        return "addPostForm";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute Post post,
                          RedirectAttributes redirectAttributes){
        Post savePost = postService.save(post);
        List<FileRequest> files = fileUtils.uploadFiles(post.getFiles());
        fileService.saveFiles(savePost.getPostId(), files);

        redirectAttributes.addAttribute("postId", savePost.getPostId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/posts/{postId}";
    }

    @GetMapping("/{postId}/edit")
    public String editForm(@PathVariable Long postId, Model model) {
        Post post = postService.findById(postId).get();
        model.addAttribute("post", post);
        model.addAttribute("postDate", post.getPostDate());
        log.info("post={}", post);
        return "editPostForm";
    }

    @PostMapping("/{postId}/edit")
    public String edit(@PathVariable Long postId,
                       @ModelAttribute PostUpdateDto updateParam) {
        postService.update(postId, updateParam);
        return "redirect:/posts/{postId}";
    }

    @RequestMapping("/posts/{postId}/delete")
    public String delete(@PathVariable Long postId) {
        postService.delete(postId);
        return "redirect:/posts";
    }
}
