import java.util.Arrays;
public class Ejercicio17{
    
    public int buscarElemento(int[]arr, int buscado){
        Arrays.sort(arr);
        int li = 0;
        int ls = arr.length-1;
        return busquedaBinaria(arr,buscado,li,ls);
    }
    
    private int busquedaBinaria(int[]arr, int buscado, int li, int ls){
        
        if(li <= ls){
            int medio = (li+ls)/2;
            if(arr[medio] == buscado){
                return medio;
            }else{
                if(arr[medio] < buscado){
                    li = medio+1;
                }else{
                    ls = medio-1;
                }
                return busquedaBinaria(arr,buscado,li,ls);
            }
        }else{
            return -1;
        }
        
    }
    private int busquedaBinaria2(int[]arr, int buscado, int li, int ls){
        int res;
        if(li <= ls){
            int medio = (li+ls)/2;
            if(arr[medio] == buscado){
                res = medio;
            }else{
                if(arr[medio] < buscado){
                    li = medio+1;
                }else{
                    ls = medio-1;
                }
                res = busquedaBinaria(arr,buscado,li,ls);
            }
        }else{
            res = -1;
        }
        return res;
    }
}
