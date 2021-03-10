package springboot.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springboot.demo.service.HelloService;

@Configuration
public class Config {

	@Bean
	public HelloService HelloService2() {
		return new HelloService();
	}
	
}
