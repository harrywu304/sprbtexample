package org.pub.sprbtfreemarker.action;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
    @RequestMapping("/hello")
    public String hello(Map<String,Object> model) {
        model.put("time",new Date());  
        model.put("message","abc"); 
        Integer.parseInt("abc");
      //返回的内容就是templetes下面文件的名称 
        return "hello";
    }
    
    @RequestMapping("/helloerror")
    public String helloerror(Map<String,Object> model) {
        Integer.parseInt("abc");
      //返回的内容就是templetes下面文件的名称 
        return "hello";
    }

}