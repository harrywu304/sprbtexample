package org.pub.sprbtprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileAction {

	@Autowired
	private Environment env;
	
	@RequestMapping("/testprof")
	public String testProfile(){
	    return env.getProperty("profile");
	}
	
	@RequestMapping("/testparam")
	public String testParam(){
	    return env.getProperty("wx.appId");
	}
	
	@RequestMapping("/testembdparam")
	public String testEmbdparam(){
	    return env.getProperty("app.nowid");
	}
}
