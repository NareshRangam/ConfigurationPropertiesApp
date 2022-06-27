package com.ss.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/example/string")
	public ResponseEntity<String> exampleString() {
	  return ResponseEntity.ok("String example here Updated");
	}

}
