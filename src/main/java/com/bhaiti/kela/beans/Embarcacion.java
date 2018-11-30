package com.bhaiti.kela.beans;

public class Embarcacion {
	
	private String dominio;
	private String eslora;
	private String manga;
	private Double deuda;

	public Double getDeuda() {
		return deuda;
	}
	public void setDeuda(Double deuda) {
		this.deuda = deuda;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public String getEslora() {
		return eslora;
	}
	public void setEslora(String eslora) {
		this.eslora = eslora;
	}
	public String getManga() {
		return manga;
	}
	public void setManga(String manga) {
		this.manga = manga;
	}

}
