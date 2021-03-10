package springboot.demo.domain;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties 默認讀取全局配置文件
 * @PropertySource 讀取指定配置文件的路徑(只能讀Properties檔案)
 * @ConditionalOnClass 系統中有指定的類，配置才生效
 */
@ConditionalOnClass({Person.class})
@ConfigurationProperties(prefix = "dog")
@Component
public class Dog {
	private String lastName;
	private Integer age;
	private String holy;
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
	public String getHoly() {
		return holy;
	}
	public void setHoly(String holy) {
		this.holy = holy;
	}
	@Override
	public String toString() {
		return "Dog [lastName=" + lastName + ", age=" + age + "]";
	}
}
