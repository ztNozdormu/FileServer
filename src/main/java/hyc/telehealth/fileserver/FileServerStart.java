package hyc.telehealth.fileserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@MapperScan("hyc.telehealth.fileserver.mapper")
@ServletComponentScan//注意如果是多模块的项目，把具体需要扫描的模块路径加上
@SpringBootApplication
public class FileServerStart {
	
     public static void main(String[] args) {
		SpringApplication.run(FileServerStart.class, args);
	}
     
}
