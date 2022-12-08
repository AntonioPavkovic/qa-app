package pavkovic.antonio.qa.subreddit.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import pavkovic.antonio.qa.subreddit.domain.Subreddit;

public interface SubredditRepository extends JpaRepository<Subreddit, Integer> {
}
