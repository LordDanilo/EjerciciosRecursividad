public class Ejercicio2{
    public int calcularFactorial(int numero){
        int res;
        if(numero == 0 || numero == 1){
            res = 1;
        }else{
            res = numero*calcularFactorial(numero-1);
        }
        return res;
    }
    
    public int calcularFactorial2(int numero){
        if(numero == 0 || numero == 1){
            return 1;
        }else{
            return numero*calcularFactorial2(numero-1);
        }
    }
}
