package com.jetherrodrigues.exercicio02;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether.rodrigues
 *
 */
public abstract class TemplateContador implements ObservadorFrase, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7063565995349034594L;

	private List<String> palavras = new ArrayList<>();

	@Override
	public void notificarPalavras(String palavra) {
		if(condicao(palavra)) {
			palavras.add(palavra);
		}
	}

	@Override
	public int recuperarContagem() {
		return palavras.size();
	}
	
	protected abstract boolean condicao(String palavra);
}
