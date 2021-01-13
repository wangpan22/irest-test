package com.ibm.ibmi.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class Test {

	@GetMapping("hello")
	public String hello() {
		return "Hello World";
	}
	
	@ApiOperation(value="Test the API. ", notes="Test the API notes.")
	@ApiImplicitParam(name = "access_token", value = "token information", required = true, paramType="Query", dataType = "String")
	@GetMapping("/ibmi/hello")
	public String apiHello() {
		return "Hello World";
	}
}
