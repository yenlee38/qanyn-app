package com.qanyn.app.controller;

import com.qanyn.app.model.Post;
import com.qanyn.app.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/qanyn")
public class PostController {

    @Autowired
    public PostService postService;

    @RequestMapping(value ="/admin/create-post")
    public String showCreatePost(Model model) {

        return "create-post";
    }

    @RequestMapping(value = "/admin/post")
    public String showPostManager(Model model) {

        return "post-management";
    }

    @RequestMapping (value = "/admin/create-post", method = RequestMethod.POST)
    public String createPost(@Valid String title, @Valid String content) {
        Post post = new Post(title, content);
        postService.createContentPost(post);
        return "redirect:/qanyn/create-post";
    }
}
