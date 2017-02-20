package br.com.estruturadedados.estruturaDeDados;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Integer[] numbers = {1, 21, 32, 43, 45, 67, 233};
		Integer valor = 67;
		Integer inicio = 0;
		Integer fim = numbers.length - 1;
		Integer result = BuscadorRecursivo.binario(numbers, valor, inicio, fim);
		
		System.out.println(result);
		
    }
}
