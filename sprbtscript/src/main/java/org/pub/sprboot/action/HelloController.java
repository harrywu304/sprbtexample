package org.pub.sprboot.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value={"/hello", "/hello.do"})
    public String hello() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping(value="/auth",method={RequestMethod.POST,RequestMethod.GET})
    public Map auth(String userName, String password) {
		Map<String,Object> rt = new HashMap<String, Object>();
		if("harry".equals(userName)){
			rt.put("result", "123456");
		} else {
			Map<String,Object> errorMap = new HashMap<String, Object>();
			errorMap.put("code", 123456);
			errorMap.put("message", "user not found");
			rt.put("error", errorMap);
		}
		
		return rt;
    }

}