package pavkovic.antonio.qa.subreddit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubredditDto {

    private Integer id;

    private String name;

    private String description;

    private int postCount;

}
