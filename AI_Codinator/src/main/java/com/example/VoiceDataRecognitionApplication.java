package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VoiceDataRecognitionApplication {
	@GetMapping("/")
	String Home()
	{
		// ここにテスト的にはDBの内容を返してあげよう
		return "Hello!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(VoiceDataRecognitionApplication.class, args);
	}
}
