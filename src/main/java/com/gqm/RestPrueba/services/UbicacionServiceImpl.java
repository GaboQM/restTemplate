package com.gqm.RestPrueba.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gqm.RestPrueba.request.DispositivoRequest;
import com.gqm.RestPrueba.response.UbicacionResponse;
import com.gqm.RestPrueba.test.Message;

import static com.gqm.RestPrueba.config.EndPointsURL.URL_LAST_LOCATION;

@Service
public class UbicacionServiceImpl  implements UbicacionService{

	private  RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public UbicacionResponse getUltimaUbicacion(DispositivoRequest dspReq) {
	    HttpHeaders headers = new HttpHeaders(); 
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    HttpEntity<DispositivoRequest> requestEntity = new HttpEntity<>(dspReq,headers);

	    try {
	    	ResponseEntity<UbicacionResponse> ubicacionResponse = restTemplate.exchange(URL_LAST_LOCATION, HttpMethod.POST, requestEntity, UbicacionResponse.class);
	    	return ubicacionResponse.getBody();
	    }catch (Exception e) {
			// TODO: handle exception
	    	System.out.println(e);
		}
		return null;
		
		
	}

	

}
