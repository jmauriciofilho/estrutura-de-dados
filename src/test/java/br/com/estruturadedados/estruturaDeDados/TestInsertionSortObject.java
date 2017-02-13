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

}
