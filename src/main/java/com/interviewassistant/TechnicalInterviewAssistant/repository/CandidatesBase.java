package com.interviewassistant.TechnicalInterviewAssistant.repository;

import com.interviewassistant.TechnicalInterviewAssistant.entites.Candidate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CandidatesBase {
    private List<Candidate> candidates = new ArrayList<>();

    public void addCandidate (Candidate candidate){
        candidates.add(candidate);
    }

    public Candidate getCandidateByMame(String name){
        return candidates.stream().filter(candidate -> candidate.name().equals(name)).findAny().get();
    }
}
