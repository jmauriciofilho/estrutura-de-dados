package br.com.estruturadedados.estruturaDeDados;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertionSortObject {

	@Test
	public void test() {
		Object[] objects = {'a', 'e', 'i', 'u', 'o'};
		Object[] result = {'a', 'e', 'i', 'o', 'u'};
		IsertionSortObject.sort(objects);
		assertArrayEquals(result, objects);
		
	}
	
	@Test
	public void testNames(){
		String[] names = {"Dois", "Carro", "Vida", "Amor", "Casa"};
		String[] result = {"Amor", "Carro", "Casa", "Dois", "Vida"};
		IsertionSortObject.sort(names);
		assertArrayEquals(result, names);
	}
	
	@Test
	public void testNumbers(){
		Integer[] numbers = {31, 41, 59, 26, 41, 58};
		Integer[] result = {26, 31, 41, 41, 58, 59};
		IsertionSortObject.sort(numbers);
		assertArrayEquals(result, numbers);
	}

}
