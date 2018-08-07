package com.jetherrodrigues.exercicio03;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TrechoConexao extends TrechoEscala implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1884743217963656616L;
    private double txAeroporto;
	
	public TrechoConexao(TrechoAereo primeiro, TrechoAereo segundo, double txAeroporto) {
		super(primeiro, segundo);
		this.txAeroporto = txAeroporto;
	}
	
	@Override
	public double getValor() {
		return super.getValor() +  this.txAeroporto;
	}
}
