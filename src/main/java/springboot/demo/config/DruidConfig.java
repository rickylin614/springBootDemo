package springboot.demo.config;

import java.sql.SQLException;
import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidConfig {

	// 默认的自动配置是判动容器中没有DataSource 容器－才会使用默认配置源
	// 把裡面的屬性跟配置文件裡面對應的屬性綁定
	@Bean
	@ConfigurationProperties("spring.datasource")
	public DataSource dataSource() throws SQLException {
		DruidDataSource dds = new DruidDataSource();
		dds.setFilters("stat"); // 加入監控功能
		return dds;
	}
	
	/**
	 * 配置druid的監控頁面
	 */
	@Bean
	public ServletRegistrationBean<StatViewServlet> statViewServlet() {
		StatViewServlet svs = new StatViewServlet();
		ServletRegistrationBean<StatViewServlet> srb = 
				new ServletRegistrationBean<StatViewServlet>(svs, "/druid/*");
		return srb;
	}

	/**
	 * 設置Web攔截器
	 */
	@Bean
	public FilterRegistrationBean<WebStatFilter> druidWebStatFilter() {
		WebStatFilter wsf = new WebStatFilter();
		FilterRegistrationBean<WebStatFilter> frb = new FilterRegistrationBean<>(wsf);
		 //靜態頁面以及監控頁面不添加此攔截器
		frb.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		//設置欲監控的頁面
		frb.setUrlPatterns(Arrays.asList("/*"));
		return frb;
	}
	

//	@Bean
//	public DruidStatInterceptor druidStatInterceptor() {
//		return new DruidStatInterceptor();
//	}

	
}
