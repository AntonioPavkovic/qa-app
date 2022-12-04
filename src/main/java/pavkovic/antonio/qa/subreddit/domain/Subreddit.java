package pavkovic.antonio.qa.subreddit.domain;

import lombok.*;
import pavkovic.antonio.qa.auth.domain.User;
import pavkovic.antonio.qa.post.domain.Post;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Subreddit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subredditId;

    @NotBlank(message = "Subreddit name is required")
    private String name;

    @NotBlank(message = "Subreddit description is required")
    private String description;

    private Instant createdAt;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> posts;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
