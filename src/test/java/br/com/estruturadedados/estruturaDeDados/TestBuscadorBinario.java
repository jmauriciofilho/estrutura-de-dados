package br.com.estruturadedados.estruturaDeDados;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBuscadorBinario {

	@Test
	public void testBuscaValorNenhum(){
		Integer[] numbers = {1, 21, 32, 43, 45, 67, 233};
		Integer valor = null;
		assertEquals(null, Buscador.binario(numbers, valor));
	}
	
	@Test
	public void testBuscaValorInexistente(){
		Integer[] numbers = {1, 21, 32, 43, 45, 67, 233};
		Integer valor = 54;
		assertEquals(null, Buscador.binario(numbers, valor));
	}
	
	@Test
	public void testBuscaValorEspecifico(){
		Integer[] numbers = {1, 21, 32, 43, 45, 67, 233};
		Integer valor = 67;
		Integer resultObtido = Buscador.binario(numbers, valor);
		Integer resultEsperado = 5;
		assertEquals(resultEsperado, resultObtido);
	}

}
