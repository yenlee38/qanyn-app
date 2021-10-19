package com.qanyn.app.service;

import com.qanyn.app.model.Post;
import com.qanyn.app.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AdminService adminService;

    public void createContentPost(Post post) {
        String adminLogin = adminService.getUsernameLoginCurrent();
        post.setCreated_at(new Date());
        post.setUpdated_at(new Date());
        post.setIs_hidden(false);
        post.setCreated_by(adminLogin);
        System.out.printf("username admin: " + adminLogin);
        if(adminLogin == "admin") {
            post.setStatus("PUBLISHED");
        } else post.setStatus("PENDDING");

        postRepository.save(post);
    }

    public List<Post> getListPostForAdminHome() {
        String adminLogin = adminService.getUsernameLoginCurrent();
        System.out.printf("username admin: " + adminLogin);
        if (adminLogin.equals("admin")) {
            return postRepository.findAll();
        }
        return postRepository.findAllBySubAdminLogin(adminLogin);
    }
}
