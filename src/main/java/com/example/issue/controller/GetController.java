package com.example.issue.controller;

import com.example.issue.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

	@Autowired
	private GetService getService;

	@RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object method() {
		return getService.method();
	}
}
