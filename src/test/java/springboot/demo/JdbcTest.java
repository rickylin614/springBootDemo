package springboot.demo;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.extern.slf4j.Slf4j;
import springboot.demo.domain.User;

@Slf4j
@SpringBootTest
public class JdbcTest {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Test
	void contextLoads() throws UnsupportedEncodingException {
		String sql = "select name,pwd from `user`";
		List<Map<String, Object>> user = new ArrayList<>();
		user = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> u : user) {
			log.info(u.toString());
		}
	}
	
}
