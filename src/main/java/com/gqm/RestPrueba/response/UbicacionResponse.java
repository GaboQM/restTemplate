package com.gqm.RestPrueba.response;

import java.util.Date;

import com.gqm.RestPrueba.bean.VelocimetroBean;
import com.gqm.RestPrueba.bean.ZonaBean;


public class UbicacionResponse {

	private Double latitud;
	private Double longitud;

	private String timestampGPS;

	private String timestampServer;
	private double velocity;
	private int conectado;
	private double grade;
	private double altitud;

	private ZonaBean zona;
	
	private VelocimetroBean velocimetro;

	// key de relacion, no mapeado
	public UbicacionResponse() {

	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public String getTimestampGPS() {
		return timestampGPS;
	}

	public void setTimestampGPS(String timestampGPS) {
		this.timestampGPS = timestampGPS;
	}

	public String getTimestampServer() {
		return timestampServer;
	}

	public void setTimestampServer(String timestampServer) {
		this.timestampServer = timestampServer;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public int getConectado() {
		return conectado;
	}

	public void setConectado(int conectado) {
		this.conectado = conectado;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double getAltitud() {
		return altitud;
	}

	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}

	public ZonaBean getZona() {
		return zona;
	}

	public void setZona(ZonaBean zona) {
		this.zona = zona;
	}

	public VelocimetroBean getVelocimetro() {
		return velocimetro;
	}

	public void setVelocimetro(VelocimetroBean velocimetro) {
		this.velocimetro = velocimetro;
	}

	@Override
	public String toString() {
		return "UbicacionResponse [latitud=" + latitud + ", longitud=" + longitud + ", timestampGPS=" + timestampGPS
				+ ", timestampServer=" + timestampServer + ", velocity=" + velocity + ", conectado=" + conectado
				+ ", grade=" + grade + ", altitud=" + altitud + ", zona=" + zona + ", velocimetro=" + velocimetro + "]";
	}

	
		
}
