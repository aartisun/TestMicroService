package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.TestEmployee;
import com.example.demo.service.ITestMicroServiceProcess;

@RestController
public class TestMicroServiceController {

	@Autowired
	ITestMicroServiceProcess itestservice;

	@RequestMapping(value = "/testmicroservice", method = RequestMethod.POST)
	public ResponseEntity<TestEmployee> testProcessEmp(@RequestBody TestEmployee empDetails) {
		System.out.println(empDetails.getEmpId());
		return itestservice.processRequest(empDetails.getEmpId());
	}
}
