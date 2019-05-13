package com.gqm.RestPrueba.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

public class DispositivoRequest {

	@NonNull
	@NotEmpty
	private String idUser;
	@NonNull
	@NotEmpty
	private String number;
	
	@NonNull
	private Integer categoria;

	public String getIdUser() {
		return idUser;
	}

	public String getNumber() {
		return number;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "DispositivoRequest [idUser=" + idUser + ", number=" + number + ", categoria=" + categoria + "]";
	}

	
	
}
