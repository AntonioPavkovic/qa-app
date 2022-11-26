package com.example.social_app_backend.controller;

import com.example.social_app_backend.model.Subreddit;
import com.example.social_app_backend.service.SubredditService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/subreddit")
public class SubredditController {

    private final SubredditService subredditService;

    @GetMapping
    public ResponseEntity<List<Subreddit>> getAllSubreddits() {
        return new ResponseEntity<>(subredditService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subreddit> getSubredditsById(@PathVariable Integer id) {
        return new ResponseEntity<>(subredditService.getSubreddit(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Subreddit> createSubreddit(@RequestBody @Valid Subreddit subreddit) {
        return new ResponseEntity<>(subredditService.save(subreddit), HttpStatus.CREATED);
    }
}
