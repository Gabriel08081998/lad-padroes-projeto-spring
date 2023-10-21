package onedigitalinnovatio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
projeto Spring boot via spring initializr.
os seguintes modulos foram selecionados:
-Spring data jpa
-Spring web
-H2 Database
-OpenFeing

@author falvojr
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}