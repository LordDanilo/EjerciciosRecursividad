public class Ejercicio6{
    public int invertirNumero(int numero){
        int res = 0;
        return invertirNumero2(numero, res);
    }
    private int invertirNumero(int numero, int res){
        if(numero == 0){
            return res;
        }else{
            int residuo = numero%10;
            numero = numero/10;
            res = (res*10)+residuo;
            return invertirNumero(numero, res);
        }
    }
    private int invertirNumero2(int numero, int res){
        int r;
        if(numero == 0){
            r = res;
        }else{
            int residuo = numero%10;
            numero = numero/10;
            res = (res*10)+residuo;
            r = invertirNumero2(numero, res);
        }
        return r;
    }
}
