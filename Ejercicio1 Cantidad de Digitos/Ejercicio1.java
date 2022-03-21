public class Ejercicio1{
    public int contarDigitos(int numero){
        int res;
        if(numero<10){
            res = 1;
        }else{
            numero = numero/10;
            res = 1+ contarDigitos(numero);
        }
        return res;
    }
    
    public int contarDigitos2(int numero){
        if(numero<10){
            return 1;
        }else{
            numero = numero/10;
            return 1+ contarDigitos2(numero);
        }
    }
}
