package org.pub.sprbtmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@MapperScan("org.pub.sprbtmybatis.mapper")
@SpringBootApplication
public class App {
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "redirect:cities";
    }
}
