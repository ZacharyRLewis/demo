package io.sds.demo.interview.complete;

import io.sds.demo.DemoApplication;
import io.sds.demo.interview.InterviewService;
import io.sds.demo.interview.complete.CompleteInterviewService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {DemoApplication.class})
public class CompleteInterviewServiceTest
{
    @Autowired
    private CompleteInterviewService service;

    @Test
    void fetchCandidateNames_passed() {
        var result = service.fetchCandidateNames(true);

        Assertions.assertEquals(result.size(), 4);
    }
}
