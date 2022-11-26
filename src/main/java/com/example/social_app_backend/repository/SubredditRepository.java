package com.example.social_app_backend.repository;

import com.example.social_app_backend.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubredditRepository extends JpaRepository<Subreddit, Integer> {

    Optional<Subreddit> findByName(String subredditName);
}
