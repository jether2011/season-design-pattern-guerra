package com.jetherrodrigues.exercicio04;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 * NullObject
 */
public class NullTitulo implements Titulo, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9106563841629693241L;

	@Override
	public String getTitulo() {
		return "";
	}

}
