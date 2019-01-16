package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.configuration.TestEmployee;

public interface ITestMicroServiceProcess {

	public ResponseEntity<TestEmployee> processRequest(int EmpId);

}
