package tech.pratikacharya.apps.messaging;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tech.pratikacharya.apps.messaging.config.JmsProperties;
import tech.pratikacharya.apps.messaging.jms.SimpleSender;

@SpringBootApplication
public class JmsSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsSenderApplication.class, args);
	}

	@Bean
	CommandLineRunner simple(JmsProperties properties, SimpleSender simpleSender){

	    return args-> {simpleSender.sendMessage(properties.getQueue(),"Hello world");};

    }
}
