package com.interviewassistant.TechnicalInterviewAssistant.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TechnicalInterviewAssistantApplicationTests {

	@Autowired
	private TechnicalInterviewAssistantController technicalInterviewAssistantController;

	@Test
	void startTest() {
		var response = technicalInterviewAssistantController.start();
		assertEquals("Привет кандидат) Отправь желаемый уровень зарплаты в долларах на ручку GET /self-estimation в query параметре salary",
				response.response(),
				"Некорректный ответ");
	}

	@ParameterizedTest
	@MethodSource("getDesirableSalary")
	void selfEstimationTest(String salary, String expectedAnswer) {
		var response = technicalInterviewAssistantController.selfEstimation(salary);
		assertEquals(expectedAnswer, response.response(), "Некорректный ответ");
	}

	@Test
	void tokenTest() {
		var response = technicalInterviewAssistantController.token();
		assertEquals(
				"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbGZhbGFidGVzdCIsImV4cCI6MTc0MjY0NTM2MywiaWF0IjoxNzExMTA5MzYzfQ.MVNCIaS5V_qILzZTwZzFZBK0lRzq5fIwuDNCokcXT4DZC7N3cggCMBhjlwJIQCky53E_Pe7oAzM2S4AlSeveqg",
				response.jwtToken(),
				"Некорректный ответ");
	}

	private static Stream<Arguments> getDesirableSalary(){
		return Stream.of(
				Arguments.of("500", "Берём не глядя)"),
				Arguments.of("2000", "Тогда тебе нужно получить токен для авторизации. Дёрни ручку GET /token на порте 12345"),
				Arguments.of("5001", "Смело! Нет у нас таких зарплат(")
		);
	}
}
