package cn.et.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //只能扫当前包和他的子包带有注解的类
public class TestMain {

	public static void main(String[] args) {
		SpringApplication.run(TestMain.class, args);
	}
	
}
