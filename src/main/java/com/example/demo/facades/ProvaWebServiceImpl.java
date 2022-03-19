package com.example.demo.facades;

import javax.jws.WebService;

import com.example.demo.model.Employee;


@WebService(endpointInterface = "com.example.demo.facades.ProvaWebService", serviceName = "ProvaWebService", targetNamespace = "http://example.com/demo/model")
public class ProvaWebServiceImpl implements ProvaWebService {

	@Override
	public Employee get(int i, Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

}
