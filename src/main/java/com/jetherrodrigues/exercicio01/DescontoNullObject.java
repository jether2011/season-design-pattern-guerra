package com.jetherrodrigues.exercicio01;

import java.io.Serializable;

public class DescontoNullObject implements Desconto, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1900681803201639409L;

	@Override
	public double calculaDesconto(double valor) {
		return valor;
	}

}
