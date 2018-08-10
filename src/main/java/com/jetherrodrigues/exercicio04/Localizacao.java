package com.jetherrodrigues.exercicio04;

import java.io.Serializable;
/**
 * 
 * @author jether.rodrigues
 * 
 * Using Proxy and Strategy
 */
public class Localizacao implements TratamentoInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2430737953643550858L;
	
	private TratamentoInterface tratamentoInterface;
	private String localizacao;

	public Localizacao(TratamentoInterface tratamentoInterface, String localizacao) {
		super();
		this.tratamentoInterface = tratamentoInterface;
		this.localizacao = localizacao;
	}

	public String gerarTratamento() {
		return tratamentoInterface.gerarTratamento() + " de " + getLocalizacao();
	}

	public Titulo getTitulo() {
		return tratamentoInterface.getTitulo();
	}

	public void setTitulo(Titulo titulo) {
		tratamentoInterface.setTitulo(titulo);
	}

	public String getLocalizacao() {
		return localizacao;
	}

}
