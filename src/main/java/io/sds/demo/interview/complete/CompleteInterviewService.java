package io.sds.demo.interview.complete;

import io.sds.demo.model.Candidate;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CompleteInterviewService
{
    private static final Map<Integer, Candidate> CANDIDATES = Map.of(
        1, Candidate.of("Aman", true),
        2, Candidate.of("Bob", true),
        3, Candidate.of("Carrie", false),
        4, Candidate.of("Dev", true),
        5, Candidate.of("Edwin", false),
        6, Candidate.of("Felipa", true)
    );

    public List<String> fetchCandidateNames(boolean passed) {
        return filterPassedCandidates(CANDIDATES, passed);
    }

    private List<String> filterPassedCandidates(Map<Integer, Candidate> candidates, boolean passed) {
        // TODO: Implement this method with Java Streams to return a list of Candidate names that passed

        return candidates.values().stream()
            .filter(c -> c.getPassed() == passed)
            .map(Candidate::getName)
            .collect(Collectors.toList());
    }

    void object() {
        var c1 = new Candidate("Tom", true);

        changeIt(c1);
        // TODO: Tell me the value of c1.getName() ?
    }

    void number() {
        int num = 100;

        changeIt(num);
        // TODO: Tell me the value of num ?
    }

    void changeIt(Candidate c) {
        c.setName("Jerry");
    }

    void changeIt(int i) {
        i = i++ % 2;
    }
}
