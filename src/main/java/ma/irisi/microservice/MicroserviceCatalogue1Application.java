package ma.irisi.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceCatalogue1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCatalogue1Application.class, args);
	}

}
