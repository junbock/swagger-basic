/* Spring Boot의 실행 main 클래스
 * 이 클래스가 포함된 package와 sub package의 모든 스프링 번들은 자동으로 등록
 */

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Step01BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step01BasicApplication.class, args);
	}

}
