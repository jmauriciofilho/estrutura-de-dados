package br.com.estruturadedados.estruturaDeDados;

public class IsertionSortObject {
	
	public static void sort(Object[] objects){
		for (int i = 1; i < objects.length; i++) {
			Object temp = objects[i];
			Integer j = i - 1;
			while(j >= 0 && objects[j].toString().compareTo(temp.toString()) > 0){
				objects[j+1] = objects[j];
				j--;
			}
			objects[j+1] = temp;
		}
	}

}
