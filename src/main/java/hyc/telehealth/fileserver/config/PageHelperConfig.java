package hyc.telehealth.fileserver.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageInterceptor;
/**
 * PageHelper 分页插件配置类
 * @author DELL
 *
 */
@Configuration
public class PageHelperConfig {

	 @Value("${pagehelper.helperDialect}")
	    private String helperDialect;

	    @Bean
	    public PageInterceptor pageInterceptor(){
	        PageInterceptor pageInterceptor = new PageInterceptor();
	        Properties properties = new Properties();
	        properties.setProperty("helperDialect", helperDialect);
	        pageInterceptor.setProperties(properties);
	        return pageInterceptor;
	    }
}
