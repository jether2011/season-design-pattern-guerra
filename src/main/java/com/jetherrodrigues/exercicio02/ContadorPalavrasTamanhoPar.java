package com.jetherrodrigues.exercicio02;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class ContadorPalavrasTamanhoPar extends TemplateContador {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2778085549723137558L;

	@Override
	public boolean condicao(String validar) {
		return validar.length() % 2 == 0;
	}
}
