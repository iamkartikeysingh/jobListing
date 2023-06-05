package com.example.jobListing.jobListing.controller;

import javax.servlet.http.HttpServletResponse;

import com.example.jobListing.jobListing.repository.PostRepository;
import com.example.jobListing.jobListing.models.Post;
import com.example.jobListing.jobListing.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;


    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/getAllPosts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @PostMapping("/createPost")
    public Post createPost(@RequestBody Post post) {
        return repo.save(post);
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }
}
