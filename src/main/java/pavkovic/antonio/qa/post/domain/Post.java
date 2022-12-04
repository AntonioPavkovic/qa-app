package pavkovic.antonio.qa.post.domain;

import lombok.*;
import org.springframework.lang.Nullable;
import pavkovic.antonio.qa.auth.domain.User;
import pavkovic.antonio.qa.subreddit.domain.Subreddit;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;

    @NotBlank(message = "Post title cannot be empty")
    private String title;

    @Lob
    @Nullable
    private String description;

    private int voteCount = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    private Instant createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subredditId", referencedColumnName = "subredditId")
    private Subreddit subreddit;

}
