package com.ss.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.beans.DBSettings;

@RestController
public class ConfigController {
	
	@Value("${my.greeting:Default Message}")
	private String message;
	
	@Value("Static Message")
	private String staticMessage;
	
	@Value("${my.list.values}")
	private List<String> listValues;
	
	@Value("#{${dbValues}}")
	private Map<String, String> dbValues;
	
	@Autowired
	private DBSettings dbSettings;
	
	@GetMapping("/message")
	public String getMessage()
	{
		return message +",Updated "+staticMessage+", "+listValues +",  "+dbValues+", "+dbSettings.getHost();
	}

}
