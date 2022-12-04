package pavkovic.antonio.qa.vote.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoteDto {

    private Integer postId;
    private VoteType voteType;

}
