package com.jetherrodrigues.teste.exercicio01;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.jetherrodrigues.exercicio01.*;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TesteCalculoItens {

	@Test
	public void itemsComDescontoAbsoluto() {
		List<Item> itens = Arrays.asList(
				new Item("camiseta", 100, new DescontoAbsoluto(10)),
				new Item("tenis", 450, new DescontoAbsoluto(100))
				);
		
		double total = Item.calculaTotal(itens);
		assertEquals(440, total, 0);
	}
	
	@Test
	public void itemsComDescontoPercentual() {
		List<Item> itens = Arrays.asList(
				new Item("camiseta", 50, new DescontoPercentual(10)),
				new Item("tenis", 400, new DescontoPercentual(40))
				);
		
		double total = Item.calculaTotal(itens);
		assertEquals(285, total, 0);
	}
	
	@Test
	public void itemsSemDesconto() {
		List<Item> itens = Arrays.asList(
				new Item("camiseta", 50, new DescontoNullObject()),
				new Item("tenis", 400, new DescontoNullObject())
				);
		
		double total = Item.calculaTotal(itens);
		assertEquals(450, total, 0);
	}
}
