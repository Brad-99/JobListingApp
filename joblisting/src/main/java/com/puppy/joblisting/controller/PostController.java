package com.puppy.joblisting.controller;


import com.puppy.joblisting.PostRepository;
import com.puppy.joblisting.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    // posts/java
    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text) {
        return repo.findAll();
    }

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPost() {
        return repo.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }

}
