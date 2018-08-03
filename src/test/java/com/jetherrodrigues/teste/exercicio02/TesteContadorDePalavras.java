package com.jetherrodrigues.teste.exercicio02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jetherrodrigues.exercicio02.*;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TesteContadorDePalavras {
	
	@Test
	public void contaTodasPalavras() {
		QuebraFrase palavras = new QuebraFrase();
		palavras.adicionarContador("TODAS", new ContaTodas());
		palavras.quebrarFrase("O Rato roeu a roupa do Rei de Roma");
		
		int quantidade = palavras.recuperarContagem("TODAS");
		
		assertEquals(9, quantidade, 0);
	}
	
	@Test
	public void contaTodasPalavrasPares() {
		QuebraFrase palavras = new QuebraFrase();
		palavras.adicionarContador("PARES", new ContadorPalavrasTamanhoPar());
		palavras.quebrarFrase("O Rato roeu a roupa do Rei de Roma");
		
		int quantidade = palavras.recuperarContagem("PARES");
		
		assertEquals(5, quantidade, 0);
	}
	
	@Test
	public void contaTodasPalavrasIniciaMaiuscula() {
		QuebraFrase palavras = new QuebraFrase();
		palavras.adicionarContador("MAIUSCULA", new ContadorPalavrasMaiuscula());
		palavras.quebrarFrase("O Rato roeu a roupa do Rei de Roma");
		
		int quantidade = palavras.recuperarContagem("MAIUSCULA");
		
		assertEquals(4, quantidade, 0);
	}
}
