package org.pub.sprboot.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
	
    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @RequestMapping("/404")
    public String teststatic() {
        return "error/404.html";
    }
    
    @RequestMapping("/gredirect")
    public String gredirect(){
    	return "redirect:http://www.baidu.com";
    }
    
    @RequestMapping("/gmix")
    public String gmix(String type){
    	if(type != null){
    		return "forward:/doforward?msg="+"not found user";
    	}
    	return "redirect:http://www.baidu.com";
    }
    		
    @RequestMapping("/doforward")
    @ResponseBody
    public String doforward(String msg){ 
    	return msg;
    }
}
