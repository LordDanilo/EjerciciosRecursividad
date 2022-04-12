import java.util.ArrayList;
public class Ejercicio23{
    public ArrayList<int[]> buscarPermutaciones(int arr[]){
        ArrayList<int[]> res = new ArrayList<>();
        buscarPermutaciones(arr,0,res);
        imprimirPermutaciones(res);
        return res;
    }

    private void buscarPermutaciones(int arr[],int pos, ArrayList<int[]> res){
        if(pos == arr.length){
            res.add(arr.clone());
        }else{
            for(int posAct = pos; posAct<arr.length; posAct++){
                cambiar(pos, posAct, arr);
                buscarPermutaciones(arr, pos+1, res);
                cambiar(pos, posAct, arr);
            }
        }
    }

    private void cambiar(int posA, int posB, int arr[]){
        int aux   = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = aux;
    }

    private void imprimirPermutaciones(ArrayList<int[]> res){
        for(int[] a : res){
            for(int x : a){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}
