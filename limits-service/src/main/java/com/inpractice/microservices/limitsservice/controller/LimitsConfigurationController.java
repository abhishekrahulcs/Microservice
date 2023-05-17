package com.inpractice.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inpractice.microservices.limitsservice.bean.LimitConfiguration;
import com.inpractice.microservices.limitsservice.config.Configuration;

@RestController
public class LimitsConfigurationController {
    
	@Autowired
	Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(config.getMaximum(), config.getMinimum());
	
	}
}
