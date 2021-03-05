package springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController = @Controller + @ResponseBody
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public Object hello() {
		return "Hello World";
	}
	
}
