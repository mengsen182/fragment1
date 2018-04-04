package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.bdqn.dao")
@SpringBootApplication
public class Fragment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Fragment1Application.class, args);
	}
}
