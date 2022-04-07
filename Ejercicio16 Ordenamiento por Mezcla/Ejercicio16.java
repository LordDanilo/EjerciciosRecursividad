import java.util.ArrayList;
public class Ejercicio16{
    public int[] ordenarArray(int[] arr){
        ArrayList<Integer> aux = new ArrayList<>();
        for(int x : arr){
            aux.add(x);
        }
        ArrayList<Integer> result = mergeSort(aux);
        int pos = 0;
        for(Integer x: result){
            arr[pos] = x;
            pos++;
        }
        return arr;
    }
    
    private ArrayList<Integer> mergeSort(ArrayList<Integer> arr){
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        if(arr.size() <= 1){
            return arr;
        }else{
            int middle = arr.size()/2;
            for(int pos=0; pos<= middle-1; pos++){
                left.add(arr.get(pos));
            }
            for(int pos=middle; pos<arr.size(); pos++){
                right.add(arr.get(pos));
            }
            left  = mergeSort(left);
            right = mergeSort(right);
            if(left.get(left.size()-1) <= right.get(0)){
                left.addAll(right);
                return left;
            }else{
                result = merge(left,right);
                return result;
            }
        }
    }
    private ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
        ArrayList<Integer> result = new ArrayList<>();
        while(left.size()>0 && right.size()>0){
            if(left.get(0) <= right.get(0)){
                result.add(left.remove(0));
            }else{
                result.add(right.remove(0));
            }
        }
        if(left.size()>0){
            result.addAll(left);
        }
        if(right.size()>0){
            result.addAll(right);
        }
        return result;
    }
}
