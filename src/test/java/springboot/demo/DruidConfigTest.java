package springboot.demo;

import java.io.UnsupportedEncodingException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class DruidConfigTest {

	@Autowired
	ApplicationContext ioc;
	
	@Autowired
	DataSource dataSource;
	
	@Test
	void contextLoads() throws UnsupportedEncodingException {
		System.out.println(ioc.containsBean("dataSource"));
		DataSource dds = (DataSource)ioc.getBean("dataSource");
		System.out.println(dds.getClass());
		System.out.println(dataSource.getClass());
		
		System.out.println(dds.equals(dataSource)); //
	}
	
}
