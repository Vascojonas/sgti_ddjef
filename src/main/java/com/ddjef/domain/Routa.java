package com.ddjef.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Routas")
public class Routa extends AbstractEntity<Long>{
	
	@Column(name ="partida" ,length=60)
	private String partida;
	
	@Column(name ="destino", length=60)
	private String destino;
	
	@Column(name ="descricao", length=255)
	private String descricao;

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
