public class Ejercicio15{
    public int[] ordenar(int[]arr){
        for(int i=1; i<= arr.length-1; i++){
            for(int j=0; j<= arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int aux  = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        return arr;
    }
    public int[] ordenarRec(int[]arr){
        int j = 0;
        int i = 1;
        return ordenarRec(arr,j,i);
    }
    private int[] ordenarRec(int[]arr, int j, int i){
        if(i<= arr.length-1){
            if(j<= arr.length-i-1){
                if(arr[j] > arr[j+1]){
                    int aux  = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = aux;
                }
                return ordenarRec(arr,j+1,i);
            }else{
                j=0;
                return ordenarRec(arr,j,i+1);
            }
        }else{
            return arr;
        }
    }
}
