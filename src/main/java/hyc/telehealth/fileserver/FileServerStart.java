package hyc.telehealth.fileserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@MapperScan("hyc.telehealth.fileserver.mapper")
@SpringBootApplication
public class FileServerStart {
	
     public static void main(String[] args) {
		SpringApplication.run(FileServerStart.class, args);
	}
     
}
