package com.jetherrodrigues.teste.exercicio04;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jetherrodrigues.exercicio04.TratamentoBuilder;
import com.jetherrodrigues.exercicio04.TratamentoInterface;

public class TestTratamento {
	
	@Test
	public void senhor() {
		TratamentoInterface senhor = new TratamentoBuilder().criarSenhor("Jether").builder();
		assertEquals("Sr. Jether", senhor.gerarTratamento());
	}
	
	@Test
	public void doutor() {
		TratamentoInterface doutor = new TratamentoBuilder().criarDoutor("Jether").builder();
		assertEquals("Dr. Jether", doutor.gerarTratamento());
	}
	
	@Test
	public void doutorReitor() {
		TratamentoInterface doutor = new TratamentoBuilder()
				.criarDoutor("Jether")
				.sendoReitor()
				.builder();
		assertEquals("Mag. Dr. Jether", doutor.gerarTratamento());
	}
	
	@Test
	public void doutorDeputado() {
		TratamentoInterface doutor = new TratamentoBuilder()
				.criarDoutor("Jether")
				.sendoDeputado()
				.builder();
		assertEquals("Exmo. Dr. Jether", doutor.gerarTratamento());
	}
	
	@Test
	public void doutorDeputadoEReitor() {
		TratamentoInterface doutor = new TratamentoBuilder()
				.criarDoutor("Jether")
				.sendoDeputado()
				.sendoReitor()
				.builder();
		assertEquals("Exmo. Mag. Dr. Jether", doutor.gerarTratamento());
	}
	
	@Test
	public void doutorDe() {
		TratamentoInterface doutor = new TratamentoBuilder()
				.criarDoutor("Jether")
				.de("Lorena")
				.builder();
		assertEquals("Dr. Jether de Lorena", doutor.gerarTratamento());
	}
}
