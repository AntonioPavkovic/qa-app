package com.example.social_app_backend.repository;

import com.example.social_app_backend.model.Comment;
import com.example.social_app_backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByPost(Post post);
}
