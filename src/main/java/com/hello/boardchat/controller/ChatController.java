package com.hello.boardchat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Slf4j
@Controller
public class ChatController {

    @GetMapping("/chat")
    public String chatGet(Model model) {
        log.info("chatController test");
        model.addAttribute("name", uuidString());
        return "chat";
    }

    private String uuidString() {
        String uuid = UUID.randomUUID().toString();
        String[] split = uuid.split("-");
        return split[4];
    }
}
