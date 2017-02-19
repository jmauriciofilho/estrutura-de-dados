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
		Integer valor = 233;
		
		Integer result = Buscador.binario(numbers, valor);
		
		System.out.println(result);
		
    }
}
