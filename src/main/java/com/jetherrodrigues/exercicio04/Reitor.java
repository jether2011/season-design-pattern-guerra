package com.jetherrodrigues.exercicio04;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Reitor implements Serializable, Titulo{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1830912492261501469L;

	@Override
	public String getTitulo() {
		return "Mag. ";
	}

}
