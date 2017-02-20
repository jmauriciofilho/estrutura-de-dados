package br.com.estruturadedados.estruturaDeDados;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mauricio on 20/02/17.
 */
public class BuscadorRecursivoTest {

    @Test
    public void testBuscaValorNenhum(){
        Integer[] numbers = {1, 21, 32, 43, 45, 67, 233};
        Integer valor = null;
        Integer inicio = 0;
        Integer fim = numbers.length - 1;
        assertEquals(null, BuscadorRecursivo.binario(numbers, valor, inicio, fim));
    }

    @Test
    public void testBuscaValorInexistente(){
        Integer[] numbers = {1, 21, 32, 43, 45, 67, 233};
        Integer valor = 54;
        Integer inicio = 0;
        Integer fim = numbers.length - 1;
        assertEquals(null, BuscadorRecursivo.binario(numbers, valor, inicio, fim));
    }

    @Test
    public void testBuscaValorEspecifico(){
        Integer[] numbers = {1, 21, 32, 43, 45, 67, 233};
        Integer valor = 67;
        Integer inicio = 0;
        Integer fim = numbers.length - 1;
        Integer resultObtido = BuscadorRecursivo.binario(numbers, valor, inicio, fim);
        Integer resultEsperado = 5;
        assertEquals(resultEsperado, resultObtido);
    }

}