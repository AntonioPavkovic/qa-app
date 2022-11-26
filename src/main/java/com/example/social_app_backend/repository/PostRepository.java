package com.example.social_app_backend.repository;

import com.example.social_app_backend.model.Post;
import com.example.social_app_backend.model.Subreddit;
import com.example.social_app_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer>{

    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}