public class Ejercicio8{
    public int rotarNumero(int numero, int rotaciones){
        int exponente = contarDigitos(numero)-1;
        int mult = (int)Math.pow(10,exponente);
        
        return rotarNumero(numero,rotaciones,mult);
    }
    
    private int rotarNumero(int numero, int rotaciones, int mult){
        if(rotaciones == 0){
            return numero;
        }else{
            numero = rotarDigito(numero,mult);
            System.out.println(numero);
            return rotarNumero(numero,rotaciones-1, mult);
        }
    }
    
    
    private int rotarNumero2(int numero, int rotaciones, int mult){
        int res;
        if(rotaciones == 0){
            res = numero;
        }else{
            numero = rotarDigito(numero,mult);
            System.out.println(numero);
            res = rotarNumero2(numero,rotaciones-1, mult);
        }
        return res;
    }
    
    private int rotarDigito(int numero, int mult){
        int dig = numero%10;
        numero = numero/10;
        int aux = dig*mult;
        numero = aux+numero;
        return numero;
    }
    
    private int contarDigitos(int numero){
        int res;
        if(numero<10){
            res = 1;
        }else{
            numero = numero/10;
            res = 1+ contarDigitos(numero);
        }
        return res;
    }
}
