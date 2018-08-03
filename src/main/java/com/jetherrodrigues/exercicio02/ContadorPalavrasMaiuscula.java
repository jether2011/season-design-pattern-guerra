package com.jetherrodrigues.exercicio02;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class ContadorPalavrasMaiuscula implements ObservadorFrase, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6758130289567895366L;

	private List<String> iniciaMaiusculas = new ArrayList<>();

	@Override
	public void notificarPalavras(String palavra) {
		if(validaSeIniciaComMaiuscula(palavra)) {
			iniciaMaiusculas.add(palavra);
		}
	}

	@Override
	public int recuperarContagem() {
		return iniciaMaiusculas.size();
	}

	private boolean validaSeIniciaComMaiuscula(String valida) {
		return Character.isUpperCase(valida.charAt(0));
	}
}
