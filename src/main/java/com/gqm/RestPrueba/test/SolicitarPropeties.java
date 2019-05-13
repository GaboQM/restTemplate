package com.gqm.RestPrueba.test;

import org.springframework.web.client.RestTemplate;

public class SolicitarPropeties {
	
	
	public static Message getOK() {
		// TODO Auto-generated method stub
		RestTemplate restTemplate= new RestTemplate();
		return restTemplate.getForObject(
				  "http://3.17.106.27:8080/jibaroservice/api/v1/testing",
				  Message.class);
	}


}
