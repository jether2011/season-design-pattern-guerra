package com.jetherrodrigues.exercicio02;

import java.io.Serializable;
import java.util.*;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class QuebraFrase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7684019822286964681L;
	private Map<String, ObservadorFrase> observadores = new HashMap<>();

	public void adicionarContador(String identificador, ObservadorFrase observador) {
		observadores.put(identificador, observador);
	}

	public void removerContador(String identificador) {
		observadores.remove(identificador);
	}

	public void quebrarFrase(String frase) {
		String[] fraseQuebrada = frase.split(" ");
		for(String palavra: fraseQuebrada) {
			observadores.values().forEach(observador -> {
				observador.notificarPalavras(palavra);
			});
		}
	}

	public int recuperarContagem(String observador) {
		return observadores.get(observador).recuperarContagem();
	}
}
