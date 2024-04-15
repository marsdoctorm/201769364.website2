package com.comp208.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeedbackController {

    @GetMapping("/feedback")
    public String showFeedbackForm() {
        // 这里返回一个视图名称，对应你的反馈页面模板
        return "feedback"; // 例如，假设你的反馈页面模板名称为 feedback.html
    }
}
