package application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "environment.api,"+"https.registro_uv_mx.contabilidad,"+"environment.configuration")
public class main {

	public static void main(String[] args) {
		
		SpringApplication.run(main.class, args);

	}

}