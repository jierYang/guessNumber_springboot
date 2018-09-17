package com.tw.train.guessNumber_springboot;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStreamReader;

@SpringBootApplication
public class GuessNumberSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuessNumberSpringbootApplication.class, args);
	}
}
