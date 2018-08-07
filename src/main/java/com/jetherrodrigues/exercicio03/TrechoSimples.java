package com.jetherrodrigues.exercicio03;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TrechoSimples implements Serializable, TrechoAereo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4231807762388203697L;
	private String origem;
	private String destino;
	private double distancia;
	private double valor;

	public TrechoSimples(String origem, String destino, double distancia, double valor) {
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
		this.valor = valor;
	}

	/* (non-Javadoc)
	 * @see com.jetherrodrigues.exercicio03.TrechoAereo#getOrigem()
	 */
	@Override
	public String getOrigem() {
		return origem;
	}

	/* (non-Javadoc)
	 * @see com.jetherrodrigues.exercicio03.TrechoAereo#getDestino()
	 */
	@Override
	public String getDestino() {
		return destino;
	}

	/* (non-Javadoc)
	 * @see com.jetherrodrigues.exercicio03.TrechoAereo#getDistancia()
	 */
	@Override
	public double getDistancia() {
		return distancia;
	}

	/* (non-Javadoc)
	 * @see com.jetherrodrigues.exercicio03.TrechoAereo#getValor()
	 */
	@Override
	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(origem);
		builder.append(";");
		builder.append(destino);
		builder.append(";");
		builder.append(distancia);
		builder.append(";");
		builder.append(valor);
		return builder.toString();
	}
	
}
