package org.pub.sprboot.action;

import javax.annotation.Resource;

import org.pub.sprboot.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Resource
	private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name) {
    	logger.debug("HelloController.hello {}",name);
        return helloService.sayHello(name);
    }

}