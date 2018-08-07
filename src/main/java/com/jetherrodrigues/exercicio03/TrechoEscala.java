package com.jetherrodrigues.exercicio03;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TrechoEscala implements TrechoAereo, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7099056344271846328L;
	private TrechoAereo primeiro;
	private TrechoAereo segundo;

	public TrechoEscala(TrechoAereo primeiro, TrechoAereo segundo) {
		super();
		
		if(!primeiro.getDestino().equals(segundo.getOrigem())) 
			throw new RuntimeException("Vôos desencontrados.");
		
		this.primeiro = primeiro;
		this.segundo = segundo;
	}

	@Override
	public String getOrigem() {
		return primeiro.getOrigem();
	}

	@Override
	public String getDestino() {
		return segundo.getDestino();
	}

	@Override
	public double getDistancia() {
		return primeiro.getDistancia() + segundo.getDistancia();
	}

	@Override
	public double getValor() {
		return primeiro.getValor() + segundo.getValor();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("De: ");
		builder.append(primeiro.toString());
		builder.append("Para: ");
		builder.append(segundo.toString());
		return builder.toString();
	}
	
	
}
