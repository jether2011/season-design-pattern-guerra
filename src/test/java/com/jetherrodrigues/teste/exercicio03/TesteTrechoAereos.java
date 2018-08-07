package com.jetherrodrigues.teste.exercicio03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jetherrodrigues.exercicio03.*;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TesteTrechoAereos {
	
	@Test
	public void escala() {
		TrechoAereo primeiro = new TrechoEscala(
				new TrechoSimples("GRU", "FOR", 2000.0, 750.00)
				,new TrechoSimples("FOR", "MAN", 3000.0, 1050.00));
		assertEquals("GRU", primeiro.getOrigem());
		assertEquals("MAN", primeiro.getDestino());
		assertEquals(5000.0, primeiro.getDistancia(), 0);
		assertEquals(1800.0, primeiro.getValor(), 0);
	}
	
	@Test
	public void conexao() {
		TrechoAereo conexao = new TrechoConexao(new TrechoSimples("GRU", "FOR", 2000.0, 750.00)
				, new TrechoSimples("FOR", "MAN", 3000.0, 1000.00), 100);
		
		assertEquals("GRU", conexao.getOrigem());
		assertEquals("MAN", conexao.getDestino());
		assertEquals(5000.0, conexao.getDistancia(), 0);
		assertEquals(1850.0, conexao.getValor(), 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void conexaoComException() {
		new TrechoEscala(
				new TrechoSimples("GRU", "FOR", 2000.0, 750.00)
				,new TrechoSimples("SP", "MAN", 3000.0, 1050.00));
	}
	
	
}
