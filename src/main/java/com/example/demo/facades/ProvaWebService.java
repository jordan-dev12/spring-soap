package com.example.demo.facades;

import javax.jws.WebService;

import com.example.demo.model.Employee;


@WebService(name = "ProvaWebService", targetNamespace = "http://example.com/demo/model") 
public interface ProvaWebService {
	
	public Employee get(int i , Employee e);

}
