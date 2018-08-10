package com.jetherrodrigues.exercicio04;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Deputado implements Titulo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7695213574358274782L;

	@Override
	public String getTitulo() {
		return "Exmo. ";
	}

}
