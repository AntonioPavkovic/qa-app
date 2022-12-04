package pavkovic.antonio.qa.comment.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

    private Integer id;

    private Integer postId;

    private Instant createdAt;

    private String text;

    private String username;

}
