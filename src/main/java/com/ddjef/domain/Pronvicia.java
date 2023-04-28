package com.ddjef.domain;

public enum Pronvicia {

	
	MP("MP", "Maputo"), 
	GZ("GZ", "Gaza"),
	IN("IN", "Inhambane"),
	MC("MC", "Manica"),
	SF("SF", "Sofala"),
	TT("TT", "Tete"),
	ZB("ZB", "Zambézia"),
	NP("NP", "Nampula"),
	NS("NS", "Niassa"),
	CD("CB", "Cabo Delegado");
	
	
	private String sigla;
	private String descricao;
	
	Pronvicia(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}
}
