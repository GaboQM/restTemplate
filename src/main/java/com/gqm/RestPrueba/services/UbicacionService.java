package com.gqm.RestPrueba.services;

import com.gqm.RestPrueba.request.DispositivoRequest;
import com.gqm.RestPrueba.response.UbicacionResponse;
import com.gqm.RestPrueba.test.Message;


public interface UbicacionService {
	
	public UbicacionResponse getUltimaUbicacion(DispositivoRequest dspReq);
	
	
}
