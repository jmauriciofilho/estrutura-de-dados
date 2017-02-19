package br.com.estruturadedados.estruturaDeDados;

public class BuscadorBinarioGenerico {
	
	public static Integer binario(Object[] objetos, Object objeto){
		if(objeto != null){
			Integer inicio = 0;
			Integer fim = objetos.length - 1;
			
			Integer media = (inicio + fim)/2;
			while(inicio <= fim){
				if (objeto.equals(objetos[media])) {
					return media;
				} else if (objetos[media].toString().compareTo(objeto.toString()) < 0){
					inicio = media + 1;
				} else if (objetos[media].toString().compareTo(objeto.toString()) > 0){
					fim = media - 1;
				}
				media = (inicio + fim)/2;
			}
			
		}
		
		return null;
	}

}
