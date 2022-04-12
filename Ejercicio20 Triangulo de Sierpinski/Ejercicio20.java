public class Ejercicio20{
    public int trianguloDeSierpinski(int n){
        if(n == 0){
            return 1;
        }else{
            return trianguloDeSierpinski(n-1) + (4*(int)Math.pow(3,n-1));
        }
    }
    
    public int trianguloDeSierpinski2(int n){
        if(n == 0){
            return 1;
        }else{
            return (trianguloDeSierpinski2(n-1)*3)+2;
        }
    }
}
