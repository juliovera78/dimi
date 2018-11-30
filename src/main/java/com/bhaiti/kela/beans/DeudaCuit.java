package com.bhaiti.kela.beans;

import java.util.ArrayList;
import java.util.List;

public class DeudaCuit {

	private String cuit;
	private List<Embarcacion> embarcaciones = new  ArrayList<>();
		
	
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public List<Embarcacion> getEmbarcaciones() {
		return embarcaciones;
	}
	public void setEmbarcaciones(List<Embarcacion> embarcaciones) {
		this.embarcaciones = embarcaciones;
	}
	
	
	
}
