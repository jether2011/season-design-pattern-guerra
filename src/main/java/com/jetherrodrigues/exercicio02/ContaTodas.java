package com.jetherrodrigues.exercicio02;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class ContaTodas implements ObservadorFrase, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7225575548839564506L;
	
	private List<String> palavras = new ArrayList<>();

	@Override
	public void notificarPalavras(String palavra) {
		palavras.add(palavra);
	}

	@Override
	public int recuperarContagem() {
		return palavras.size();
	}

}
