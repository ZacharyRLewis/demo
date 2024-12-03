package io.sds.demo.model.complete;

public record Candidate(String name, Boolean passed)
{
    public static Candidate of(String name, Boolean passed) {
        return new Candidate(name, passed);
    }
}
