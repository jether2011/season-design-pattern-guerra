package com.jetherrodrigues.exercicio02;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class ContadorPalavrasMaiuscula extends TemplateContador {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6758130289567895366L;

	@Override
	public boolean condicao(String valida) {
		return Character.isUpperCase(valida.charAt(0));
	}
}
