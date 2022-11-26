package com.example.social_app_backend.DTO.Subreddit;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubredditDTO {

    private Integer id;
    private String name;
    private String description;
    private Integer numOfPosts;

}
