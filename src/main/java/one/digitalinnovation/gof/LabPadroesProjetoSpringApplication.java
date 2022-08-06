package one.digitalinnovation.gof;

import one.digitalinnovation.gof.controller.ClientesRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/*
* Projeto SpringBoot gerado via Initializr
* Os seguintes modulos foram selecionados:
* 	JPA
* 	Web
* 	h2
* 	OpenFeign
* */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
		ClientesRestController c = new ClientesRestController();
	}

}
