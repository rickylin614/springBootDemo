package springboot.demo;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import springboot.demo.domain.Person;

@SpringBootTest
class SpringbootdemoApplicationTests {

	@Autowired
	Person person;
	
	@Test
	void contextLoads() throws UnsupportedEncodingException {
		System.out.println(person.toString());
//		System.out.println("中文字");
	}

}
