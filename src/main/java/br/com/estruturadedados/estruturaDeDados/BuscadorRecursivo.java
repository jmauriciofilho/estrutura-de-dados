package br.com.estruturadedados.estruturaDeDados;

/**
 * Created by mauricio on 20/02/17.
 */
public class BuscadorRecursivo {

    public static Integer binario(Integer[] numbers, Integer valor, Integer inicio, Integer fim){
        if(valor != null){
            if(inicio > fim){
                return null;
            }else{
                Integer media = (inicio + fim)/2;
                if (valor == numbers[media]){
                    return media;
                } else if (valor > numbers[media]){
                    inicio = media + 1;
                    binario(numbers, valor, inicio, fim);
                } else if (valor < numbers[media]){
                    fim = media - 1;
                    binario(numbers, valor, inicio, fim);
                }
            }
        }

        return null;

    }
}
