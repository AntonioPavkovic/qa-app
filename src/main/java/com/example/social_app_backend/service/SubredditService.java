package com.example.social_app_backend.service;

import com.example.social_app_backend.exceptions.SubredditNotFoundException;
import com.example.social_app_backend.model.Subreddit;
import com.example.social_app_backend.repository.SubredditRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubredditService {

    private final SubredditRepository subredditRepository;

    public List<Subreddit> getAll() {
        return subredditRepository.findAll();
    }

    public Subreddit save(Subreddit subreddit) {
        return subredditRepository.save(subreddit);
    }

    public Subreddit getSubreddit(Integer id) {
        Subreddit subreddit = subredditRepository.findById(id)
                .orElseThrow(() -> new SubredditNotFoundException("Subreddit with id: " + id + " was not found."));
        return subreddit;
    }
}
