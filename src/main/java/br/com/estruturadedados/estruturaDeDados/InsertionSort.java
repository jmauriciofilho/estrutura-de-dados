package br.com.estruturadedados.estruturaDeDados;

public class InsertionSort {
	
	public static void sort(Integer[] vetor){
		for (int i = 1; i < vetor.length; i++) {
			Integer temp = vetor[i];
			Integer j = i - 1;
			while(j >= 0 && temp < vetor[j]){
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = temp;
		}
	}

}
