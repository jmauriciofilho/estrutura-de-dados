package br.com.estruturadedados.estruturaDeDados;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertionSort {

	@Test
	public void test() {
		Integer[] vetor = {31, 41, 59, 26, 41, 58};
		Integer[] result = {26, 31, 41, 41, 58, 59};
		InsertionSort.sort(vetor);
		assertArrayEquals(result, vetor);
	}

}
