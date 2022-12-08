package pavkovic.antonio.qa.subreddit.application;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pavkovic.antonio.qa.subreddit.domain.Subreddit;
import pavkovic.antonio.qa.subreddit.domain.SubredditDto;
import pavkovic.antonio.qa.subreddit.exception.SubredditNotFoundException;
import pavkovic.antonio.qa.subreddit.infrastructure.SubredditRepository;

import java.util.List;
import static java.time.Instant.now;
import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class SubredditService {

    private SubredditRepository subredditRepository;

    @Transactional(readOnly = true)
    public List<SubredditDto> getAll() {
        return subredditRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(toList());
    }

    @Transactional
    public SubredditDto save(SubredditDto subredditDto) {
        Subreddit subreddit = subredditRepository.save(mapToSubreddit(subredditDto));
        subredditDto.setId(subreddit.getSubredditId());

        return subredditDto;
    }

    public SubredditDto getSubreddit(Integer id) {
        Subreddit subreddit = subredditRepository.findById(id)
                .orElseThrow(() -> new SubredditNotFoundException("Subreddit with id: " + id + " was not found"));

        return mapToDto(subreddit);
    }

    private SubredditDto mapToDto(Subreddit subreddit) {
        return SubredditDto.builder().name(subreddit.getName())
                .id(subreddit.getSubredditId())
                .postCount(subreddit.getPosts().size())
                .build();
    }

    private Subreddit mapToSubreddit(SubredditDto subredditDto) {
        return Subreddit.builder().name(subredditDto.getName())
                .description(subredditDto.getDescription())
//                .user(userService)
                .createdAt(now()).build();
    }

}
