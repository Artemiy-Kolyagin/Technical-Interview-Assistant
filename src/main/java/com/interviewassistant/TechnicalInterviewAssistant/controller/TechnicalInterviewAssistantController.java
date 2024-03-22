package com.interviewassistant.TechnicalInterviewAssistant.controller;

import com.interviewassistant.TechnicalInterviewAssistant.entites.Candidate;
import com.interviewassistant.TechnicalInterviewAssistant.entites.FirstMission;
import com.interviewassistant.TechnicalInterviewAssistant.entites.StartResponse;
import com.interviewassistant.TechnicalInterviewAssistant.entites.TokenResponse;
import com.interviewassistant.TechnicalInterviewAssistant.model.SelfEstimationService;
import com.interviewassistant.TechnicalInterviewAssistant.repository.CandidatesBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TechnicalInterviewAssistantController {

    @Autowired
    SelfEstimationService selfEstimationService;

    @Autowired
    CandidatesBase candidatesBase;

    @GetMapping("/start")
    public StartResponse start(){
        return new StartResponse("Привет кандидат) Отправь желаемый уровень зарплаты в долларах на ручку GET /self-estimation в query параметре salary");
        //todo Basic authoristion
    }

    @GetMapping("/desired-salary")
    public FirstMission selfEstimation(@RequestParam String salary){
        return selfEstimationService.selfEstimation(salary);
    }

    @GetMapping("/token")
    public TokenResponse token(){
        return new TokenResponse("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbGZhbGFidGVzdCIsImV4cCI6MTc0MjY0NTM2MywiaWF0IjoxNzExMTA5MzYzfQ.MVNCIaS5V_qILzZTwZzFZBK0lRzq5fIwuDNCokcXT4DZC7N3cggCMBhjlwJIQCky53E_Pe7oAzM2S4AlSeveqg");
    }

    @PostMapping("/top-skills")
    public void topSkills(@RequestBody Candidate candidate){
        candidatesBase.addCandidate(candidate);
    }
}
