package org.pub.sprboot.service.impl;

import org.pub.sprboot.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
