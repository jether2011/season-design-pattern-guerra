package com.jetherrodrigues.exercicio01;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7724017461559749103L;
	private String nome;
	private double valorAbsoluto;
	private Desconto desconto;

	public Item(String nome, double valorAbsoluto) {
		this.nome = nome;
		this.valorAbsoluto = valorAbsoluto;
	}

	public Item(String nome, double valorAbsoluto, Desconto desconto) {
		this.nome = nome;
		this.valorAbsoluto = valorAbsoluto;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {	
		return this.desconto.calculaDesconto(valorAbsoluto);
	}

	public void setValor(double valor) {
		this.valorAbsoluto = valor;
	}

	public Desconto getDesconto() {
		return desconto;
	}

	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

	public static double calculaTotal(List<Item> itens) {
		double total = 0.0;
		
		for(Item item : itens) {
			total += item.getValor();
		}
		
		return total;
	}
}
