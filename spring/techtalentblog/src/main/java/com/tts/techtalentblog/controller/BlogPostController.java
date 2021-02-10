package com.tts.techtalentblog.controller;

import com.tts.techtalentblog.model.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPostController {

    @GetMapping("/")
    public String index(BlogPost blogPost) {
        // since we are utilizing thymeleaf
        // our output will be generated in a template
        // returning a reference to said template
        // will allow us to show the data that we want
        return "blogpost/index";
    }

}
