package com.jetherrodrigues.exercicio01;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class DescontoAbsoluto implements Desconto, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2983713824808384782L;

	private double descontoAbsoluto;
	
	public DescontoAbsoluto(double descontoAbsoluto) {
		this.descontoAbsoluto = descontoAbsoluto;
	}

	public double calculaDesconto(double valor) {
		return valor - this.descontoAbsoluto;
	}
}
