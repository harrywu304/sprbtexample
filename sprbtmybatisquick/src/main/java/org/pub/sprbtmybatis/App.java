package org.pub.sprbtmybatis;

import javax.annotation.Resource;

import org.pub.sprbtmybatis.service.CityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class App implements CommandLineRunner{
	
	@Resource
	private CityService cityService;
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		cityService.getByName("广州");
		
	}

}
