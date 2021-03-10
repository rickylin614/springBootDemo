package springboot.demo;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import springboot.demo.domain.Dog;
import springboot.demo.domain.Person;

@SpringBootTest
class SpringbootdemoApplicationTests {

	@Autowired
	Person person;
	
	@Autowired
	Dog dog;
	
	@Autowired
	ApplicationContext ioc;
	
	@Test
	void contextLoads() throws UnsupportedEncodingException {
		// 從application.properties/yml中取得屬性值
		System.out.println(person.toString());
		System.out.println(dog.toString());
		
		// 主程序的@ImportResource({"classpath:/beans/beans.xml"})，從文件讀取bean
		System.out.println(ioc.containsBean("HelloServiceFromXml"));
		
		// 確認使用@Configuration配置類，做配置文件產生bean
		System.out.println(ioc.containsBean("HelloService2"));
		
	}

}
