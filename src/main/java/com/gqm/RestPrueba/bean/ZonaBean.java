package com.gqm.RestPrueba.bean;

public class ZonaBean {

	private Double zonaLat;

	private Double zonaLong;

	private String zonaName;

	public Double getZonaLat() {
		return zonaLat;
	}

	public void setZonaLat(Double zonaLat) {
		this.zonaLat = zonaLat;
	}

	public Double getZonaLong() {
		return zonaLong;
	}

	public void setZonaLong(Double zonaLong) {
		this.zonaLong = zonaLong;
	}

	public String getZonaName() {
		return zonaName;
	}

	public void setZonaName(String zonaName) {
		this.zonaName = zonaName;
	}

	@Override
	public String toString() {
		return "ZonaResponse [zonaLat=" + zonaLat + ", zonaLong=" + zonaLong + ", zonaName=" + zonaName + "]";
	}

		
}
