package com.gqm.RestPrueba;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gqm.RestPrueba.config.EndPointsURL;
import com.gqm.RestPrueba.test.SolicitarPropeties;



@SpringBootApplication
public class RestPruebaApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(RestPruebaApplication.class, args);
		
	EndPointsURL.PROPERTIES=SolicitarPropeties.getOK();
	
	System.out.println(EndPointsURL.PROPERTIES.toString());
		
	}

	
	
}
