package com.jrp.pma.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	private TestEmp emp;
	
	public TestService () {
	}
	
	public void tryEmp() {
		System.out.println("emp ="+emp);
	}
}
