package br.com.estruturadedados.estruturaDeDados;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestBuscadorBinarioGenerico {

	@Test
	public void testBuscaValorNenhum() {
		Integer[] numbers = { 1, 21, 32, 43, 45, 67, 233 };
		Integer valor = null;
		assertEquals(null, BuscadorBinarioGenerico.binario(numbers, valor));
	}

	@Test
	public void testBuscaValorInexistente() {
		Integer[] numbers = { 1, 21, 32, 43, 45, 67, 233 };
		Integer valor = 54;
		assertEquals(null, BuscadorBinarioGenerico.binario(numbers, valor));
	}

	@Test
	public void testBuscaValorEspecifico() {
		Integer[] numbers = { 1, 21, 32, 43, 45, 67, 233 };
		Integer valor = 67;
		assertEquals((Integer) 5, BuscadorBinarioGenerico.binario(numbers, valor));
	}

}
