package org.pub.sprboot.action;

import java.util.HashMap;
import java.util.Map;

import org.pub.sprboot.bean.CityBean;
import org.pub.sprboot.bean.HiBean;
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
    
    @RequestMapping(value={"/sayhi"})
    public Object sayHi(int type){
    	Object rt = null;
    	if(type == 1){
    		HiBean hi = new HiBean();
    		hi.setName("demo");
    		hi.setCity("guangzhou");
    		rt = hi;
    	} else {
    		Map<String, Object> errMap = new HashMap<String, Object>();
    		errMap.put("errcode", 4100);
    		errMap.put("errmsg", "at not found");
    		rt = errMap;
    	}
    	return rt;
    }
    
    //这里要检测的是同时传递多个对象且参数有重名的情况
    @RequestMapping(value={"/hi"})
    public String hi(HiBean hiBean, CityBean cityBean){
    	return "hiBean:"+hiBean.getName()+","+"cityBean:"+cityBean.getName();
    }

}