package com.example.social_app_backend.exceptions;

public class SubredditNotFoundException extends RuntimeException{

    public SubredditNotFoundException(String message) {
        super(message);
    }
}