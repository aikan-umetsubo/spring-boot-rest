package com.example.restapp;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/user")
	public User get(
    @RequestParam(value = "name", defaultValue = "ieyasu")
    String name
  ) {
		return new User(counter.incrementAndGet(), name);
	}
}
