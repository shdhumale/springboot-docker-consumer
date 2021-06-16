package com.siddhu;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
public class SpringbootDockerConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
			ApplicationContext ctx = SpringApplication.run(
					SpringbootDockerConsumerApplication.class, args);
				
		}
			
}
