package io.sds.demo.interview;

import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

//TODO: Set this up as a Spring controller
public class InterviewController
{
    // TODO: Add instance of InterviewService

    public List<String> getCandidates(@RequestParam(name = "passed") boolean passed) {
        // TODO: Call InterviewService to return a filtered list of candidates
        return null;
    }
}
