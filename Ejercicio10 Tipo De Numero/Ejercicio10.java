public class Ejercicio10{
    public String verificarNumero(int numero){
        int div = 1;
        int sumatoria = sumarDivisoresPropios2(numero,div);
        String res = "";
        if(sumatoria == numero){
            res = "Es un numero Perfecto";
        }else{
            if(sumatoria < numero){
                res = "Es un numero Defectivo";
            }else{
                res = "Es un numero Abundante";
            }
        }
        return res;
    }
    private int sumarDivisoresPropios(int numero, int div){
        int res;
        if(div > (numero/2)){
            res = 0;
        }else{
            int aux = 0;
            if(numero % div == 0){
                aux = div;
            }
            res = aux+sumarDivisoresPropios(numero, div+1);
        }
        return res;
    }
    private int sumarDivisoresPropios2(int numero, int div){
        if(div > (numero/2)){
            return 0;
        }else{
            int aux = 0;
            if(numero % div == 0){
                aux = div;
            }
            return aux+sumarDivisoresPropios2(numero, div+1);
        }
    }
}
