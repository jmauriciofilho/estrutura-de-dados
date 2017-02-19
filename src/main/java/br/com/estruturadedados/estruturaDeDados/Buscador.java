package br.com.estruturadedados.estruturaDeDados;

public class Buscador {
	
	public static Integer binario(Integer[] numbers, Integer valor){
		if(valor != null){
			Integer inicio = 0;
			Integer fim = numbers.length - 1;
			
			Integer media = (inicio + fim)/2;
			while(inicio <= fim){
				if (valor == numbers[media]) {
					return media;
				} else if (valor > numbers[media]){
					inicio = media + 1;
				} else if (valor < numbers[media]){
					fim = media - 1;
				}
				media = (inicio + fim)/2;
			}
			
		}
		
		return null;
		
	}

}
