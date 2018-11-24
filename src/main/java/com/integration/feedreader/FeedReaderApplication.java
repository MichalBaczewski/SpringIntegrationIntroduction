package com.integration.feedreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("/integrator/feed.xml")
public class FeedReaderApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext ctx = new SpringApplication(FeedReaderApplication.class)
				.run(args);
		System.out.println("Hit Enter to terminate");
		System.in.read();
		ctx.close();
//		SpringApplication.run(FeedReaderApplication.class, args);
	}
}
