package pavkovic.antonio.qa.subreddit.presentation;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pavkovic.antonio.qa.subreddit.application.SubredditService;
import pavkovic.antonio.qa.subreddit.domain.SubredditDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/subreddit")
public class SubredditController {

    private final SubredditService subredditService;

    @GetMapping
    public ResponseEntity<List<SubredditDto>> getAllSubreddits() {
        return new ResponseEntity<>(subredditService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubredditDto> getSubreddit(@PathVariable Integer id) {
        return new ResponseEntity<>(subredditService.getSubreddit(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SubredditDto> create(@RequestBody @Valid SubredditDto subredditDto) {
        return new ResponseEntity<>(subredditService.save(subredditDto), HttpStatus.CREATED);
    }
}
