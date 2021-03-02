package springboot.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties 默認讀取全局配置文件
 * @PropertySource 讀取指定配置文件的路徑
 */
@PropertySource(value = { "classpath:other/person.properties" })
@ConfigurationProperties(prefix = "person")
@Component
public class Person {
	private String lastName;
	private Integer age;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + "]";
	}

}
