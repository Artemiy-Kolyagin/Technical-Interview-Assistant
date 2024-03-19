package com.interviewassistant.TechnicalInterviewAssistant.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechnicalInterviewAssistantController {

    @GetMapping("/")
    public String greetings(){
        return "Hello, candidate!";
    }
}
