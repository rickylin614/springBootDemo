package springboot.demo.domain;

import lombok.Data;

@Data
public class User {

	Long id;

	String name;

	String pwd;

	String sessionId;

	public User(Long id, String name, String pwd, String sessionId) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.sessionId = sessionId;
	}
}
