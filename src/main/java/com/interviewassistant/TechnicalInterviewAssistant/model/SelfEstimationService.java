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
        } else result = new FirstMission("Тогда идём дальше. Тебе нужно получить токен для авторизации. " +
                "Дёрни ручку GET /token на порте 12345. " +
                "Затем отправь на ручку POST /top-skills 3 своих главных навыка в теле запроса в JSON формате." +
                "Формат name : значение(твоё имя), skills : значения в виде массива строк (твои навыки)");

        return result;
    }
}
