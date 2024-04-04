package io.sds.demo.model;

import java.util.Map;

public class Candidate
{
    private String name;
    private Boolean passed;

    public static Candidate of(String name, Boolean passed) {
        return new Candidate(name, passed);
    }

    public Candidate(String name, Boolean passed)
    {
        this.name = name;
        this.passed = passed;
    }

    public String getName()
    {
        return name;
    }

    public Boolean getPassed()
    {
        return passed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPassed(Boolean passed)
    {
        this.passed = passed;
    }
}
