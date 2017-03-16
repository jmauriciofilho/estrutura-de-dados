package br.com.estruturadedados.estruturaDeDados;

/**
 * Created by mauricio on 01/03/17.
 */
public class BuscadorGenericoRecursivo {

    public static Integer binario(Object[] objs, Object obj, Integer inicio, Integer fim){
        if(obj != null){
            if(inicio > fim){
                return null;
            }else{
                Integer media = (inicio + fim)/2;
                if (obj.equals(objs[media])){
                    return media;
                } else if (objs[media].toString().compareTo(obj.toString()) < 0){
                    inicio = media + 1;
                    return binario(objs, obj, inicio, fim);
                } else if (objs[media].toString().compareTo(obj.toString()) > 0){
                    fim = media - 1;
                    return binario(objs, objs, inicio, fim);
                }
            }
        }

        return null;

    }
}
