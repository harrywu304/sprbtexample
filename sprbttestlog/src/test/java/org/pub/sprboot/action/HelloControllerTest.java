package org.pub.sprboot.action;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pub.sprboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private HelloService helloService;

	@Test
	public void testHello() throws Exception {
		given(this.helloService.sayHello("harry")).willReturn("hello harry");
		this.mvc.perform(get("/hello?name=harry").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk())
				.andExpect(content().string("hello harry"));
		
		// 2、post请求测试
//	       request = MockMvcRequestBuilders.post("/users")
//	                                   .param("id","1")
//	                                   .param("name","林峰")
//	                                   .param("age","20")
//	              ;	
//	       mvc.perform(request).andExpect(status().isOk()).andExpect(content().string("success"));
	}

}
