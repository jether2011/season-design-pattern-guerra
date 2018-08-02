package com.jetherrodrigues.exercicio01;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class DescontoPercentual implements Desconto, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2025157579536850490L;
	private double percentagemDesconto;

	public DescontoPercentual(double percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}

	public double calculaDesconto(double valor) {
		return valor * (100 - this.percentagemDesconto) / 100;
	}

}
