package com.nicknet.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.nicknet.didemo.controllers.MyController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
	MyController controller = (MyController) ctx.getBean("myController");
	controller.hello();

	}

}
