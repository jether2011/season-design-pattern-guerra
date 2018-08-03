package com.jetherrodrigues.exercicio02;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class ContadorPalavrasTamanhoPar implements Serializable, ObservadorFrase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2778085549723137558L;
	private List<String> palavrasPares = new ArrayList<>();
	
	@Override
	public void notificarPalavras(String palavra) {
		if (tamanhoPar(palavra)) {
			palavrasPares.add(palavra);
		}
	}

	@Override
	public int recuperarContagem() {
		return palavrasPares.size();
	}

	private boolean tamanhoPar(String validar) {
		return validar.length() % 2 == 0;
	}
}
