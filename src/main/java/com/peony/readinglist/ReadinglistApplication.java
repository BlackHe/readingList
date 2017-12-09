package com.peony.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.FileInputStream;

@SpringBootApplication
@EnableScheduling
public class ReadinglistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadinglistApplication.class, args);
	}
}
