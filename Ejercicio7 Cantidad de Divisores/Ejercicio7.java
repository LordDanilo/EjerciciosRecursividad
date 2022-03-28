public class Ejercicio7{
    public int contarDivisores(int numero){
        int candidato = 2;
        int res;
        if(numero == 1){
            res = 1;
        }else{
            res = 2+contarDivisores2(numero,candidato);
        }
        return res;
    }
    private int contarDivisores(int numero, int div){
        int cont;
        if(div > (numero/2)){
            cont = 0;
        }else{
            int aux = 0;
            if(numero%div == 0){
                aux = 1;
            }
            cont = aux+contarDivisores(numero,div+1);
        }
        return cont;
    }
    private int contarDivisores2(int numero, int div){
        if(div > (numero/2)){
            return 0;
        }else{
            int aux = 0;
            if(numero%div == 0){
                aux = 1;
            }
            return aux+contarDivisores2(numero,div+1);
        }
    }
}
