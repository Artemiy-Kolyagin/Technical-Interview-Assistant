package com.interviewassistant.TechnicalInterviewAssistant.model;

import com.interviewassistant.TechnicalInterviewAssistant.entites.FirstMission;
import org.springframework.stereotype.Service;

@Service
public class SelfEstimationService {

    public FirstMission selfEstimation (String salary){
        FirstMission result;
        int intSalary = Integer.parseInt(salary);
        if (intSalary <= 500) {
            result = new FirstMission("Берём не глядя)");
        } else if (intSalary > 5000){
            result = new FirstMission("Смело! Нет у нас таких зарплат(");
        } else result = new FirstMission("Тогда тебе нужно получить токен для авторизации. Дёрни ручку GET /token на порте 12345");

        return result;
    }
}
