package springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


/**
 * @RestController = @Controller + @ResponseBody
 */
@Slf4j
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public Object hello() {
		return "Hello World";
	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/countTest")
	public Object countTest() {
		String sql = "select name,pwd from `user`";
		List<Map<String, Object>> user = new ArrayList<>();
		user = jdbcTemplate.queryForList(sql);
		StringBuilder sb = new StringBuilder();
		for (Map<String, Object> u : user) {
			sb.append(u.toString()).append("<br>");
		}
		return sb.toString();
	}
	
	
}
