package com.example.demo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.configuration.TestEmployee;

@Service(value="Test")
public class TestMicroServiceProcessImpl implements ITestMicroServiceProcess {

	/*
	 * @Autowired TestEmployee emp;
	 */
	@Override
	public ResponseEntity<TestEmployee> processRequest(int EmpId) {
		TestEmployee emp = new TestEmployee(EmpId, "aarti", 1000);
		return new ResponseEntity<TestEmployee>(emp, HttpStatus.OK);

	}
}
