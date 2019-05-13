package com.gqm.RestPrueba.controllers;

import static com.gqm.RestPrueba.config.EndPointsURL.URL_BASE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gqm.RestPrueba.config.EndPointsURL;
import com.gqm.RestPrueba.test.SolicitarPropeties;

@RequestMapping(URL_BASE)
@RestController
public class ValidaController {

	
	@GetMapping("/validado")
	public void update() {
		System.out.println(EndPointsURL.PROPERTIES);
	}
	@GetMapping("/reconsulta")
	public void reconsulta() {
		EndPointsURL.PROPERTIES=SolicitarPropeties.getOK();
		System.out.println(EndPointsURL.PROPERTIES);
	}
}
