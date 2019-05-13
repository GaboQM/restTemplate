package com.gqm.RestPrueba.bean;

public class VelocimetroBean {

		private int velocidad;
		private boolean activado;
		
		
		public int getVelocidad() {
			return velocidad;
		}
		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}
		public boolean isActivado() {
			return activado;
		}
		public void setActivado(boolean activado) {
			this.activado = activado;
		}
		@Override
		public String toString() {
			return "Velocimetro [velocidad=" + velocidad + ", activado=" + activado + "]";
		}
		
		
	
}
