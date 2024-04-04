package io.sds.demo.interview.complete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/complete/interview")
public class CompleteInterviewController
{
    @Autowired
    private CompleteInterviewService interviewService;

    @GetMapping("/candidates")
    public List<String> getCandidates(@RequestParam(name = "passed") boolean passed) {
        // TODO: Call InterviewService to return a filtered list of candidates
        return interviewService.fetchCandidateNames(passed);
    }
}
