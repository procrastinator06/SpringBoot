package com.example.sprinstarter.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.sprinstarter.models.Account;
import com.example.sprinstarter.models.Post;
import com.example.sprinstarter.services.AccountService;
import com.example.sprinstarter.services.PostService;

@Component
public class SeedData implements CommandLineRunner {
    
    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String...args) throws Exception {

        Account account01 = new Account();
        Account account02 = new Account();

        account01.setEmail("kaifnaseem46@gmail.com");
        account01.setFirstName("Md");
        account01.setPassword("password01");

        account02.setEmail("mdkaif5210@gmail.com");
        account02.setFirstName("Kaif");
        account02.setPassword("password02");

        accountService.save(account01);
        accountService.save(account02);

        List<Post> posts = postService.getAll();
        if(posts.size() == 0) {
            Post post01 = new Post();
            post01.setTitle("Post 01");
            post01.setBody("Post 01 Body...........");
            post01.setAccount(account01);
            postService.save(post01);

            Post post02 = new Post();
            post02.setTitle("Post 02");
            post02.setBody("Post 02 Body...........");
            post02.setAccount(account02);
            postService.save(post02);
        }
    }

}
