package com.jetherrodrigues.exercicio04;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public abstract class Tratamento implements Serializable, TratamentoInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7929491691422710276L;
	private String nome;
	/**
	 * using NullObject (NullTitulo) and Strategy (Titulo)
	 */
	private Titulo titulo = new NullTitulo();
	
	public Tratamento(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String gerarTratamento() {
		/**
		 * using HookMethod prefixo()
		 */
		return this.titulo.getTitulo() + prefixo() + this.nome;
	}

	@Override
	public Titulo getTitulo() {
		return titulo;
	}

	@Override
	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
	
	protected abstract String prefixo();

}
