package com.tts.JUnitWithSpringBoot;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		return "Hello there.";
	}
}