package com.gqm.RestPrueba.controllers;
import static com.gqm.RestPrueba.config.EndPointsURL.URL_BASE;
import static com.gqm.RestPrueba.config.EndPointsURL.URL_LAST_LOCAT;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gqm.RestPrueba.config.EndPointsURL;
import com.gqm.RestPrueba.request.DispositivoRequest;
import com.gqm.RestPrueba.response.UbicacionResponse;
import com.gqm.RestPrueba.services.UbicacionService;



@RequestMapping(URL_BASE)
@RestController
public class UbicacionController {
	
	@Autowired
	UbicacionService ubicacionService;
	
	@RequestMapping(value=URL_LAST_LOCAT, method=RequestMethod.POST,  produces = "application/json")
	public ResponseEntity<?> ultimaUbicacion(@Validated @RequestBody DispositivoRequest dspr) {
		UbicacionResponse u =ubicacionService.getUltimaUbicacion(dspr);
		
		
		if(u!=null) {
			System.out.println(EndPointsURL.PROPERTIES);
			return new ResponseEntity<UbicacionResponse>(u,HttpStatus.OK);
			
			
		}
		
		return new ResponseEntity<Object>((Object) "SERVER_00_ERROR" ,HttpStatus.EXPECTATION_FAILED);
		
		
	}
	
	@GetMapping("/update")
	public void update() {
		EndPointsURL.PROPERTIES.setCode("UPDATE");
		System.out.println(EndPointsURL.PROPERTIES);
	}
	
}
