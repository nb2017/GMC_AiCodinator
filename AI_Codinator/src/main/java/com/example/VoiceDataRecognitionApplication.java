package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VoiceDataRecognitionApplication {

	@GetMapping("/")
	string home()
	{


		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(VoiceDataRecognitionApplication.class, args);
	}
}
