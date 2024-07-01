package interview;

import io.sds.demo.DemoApplication;
import io.sds.demo.interview.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {DemoApplication.class})
public class InterviewServiceTest
{
    @Autowired
    private InterviewService interviewService;

    // TODO: Create a Test for InterviewService
}
