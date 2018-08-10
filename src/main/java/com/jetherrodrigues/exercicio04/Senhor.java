package com.jetherrodrigues.exercicio04;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Senhor extends Tratamento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8004146178372370417L;

	public Senhor(String titulo) {
		super(titulo);
	}

	@Override
	protected String prefixo() {
		return "Sr. ";
	}

}
