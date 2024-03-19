package com.interviewassistant.TechnicalInterviewAssistant.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TechnicalInterviewAssistantApplicationTests {

	@Autowired
	private TechnicalInterviewAssistantController technicalInterviewAssistantController;

	@Test
	void greetingsTest() {
		var response = technicalInterviewAssistantController.greetings();
		assertEquals("Hello, candidate!", response, "Некорректный ответ");
	}

}
