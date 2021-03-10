package springboot.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @ConfigurationProperties 默認讀取全局配置文件
 * @PropertySource 讀取指定配置文件的路徑
 */
@PropertySource(value = { "classpath:other/person.properties" })
@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person {
	private String lastName;
	private Integer age;
}
