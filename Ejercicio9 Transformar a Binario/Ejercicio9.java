public class Ejercicio9{
    public int transformar(int numero){
        int base = 10;
        int exp = 0;
        return transformar(numero,base,exp);
    }
    
    private int transformar(int numero, int base, int exp){
        int res;
        if(numero == 0){
            res = 0;
        }else{
            int residuo = numero%2;
            numero = numero/2;
            res = (residuo*(int)(Math.pow(base,exp))+transformar(numero,base,exp+1));
        }
        return res;
    }
    
    private int transformar2(int numero, int base, int exp){
        if(numero == 0){
            return 0;
        }else{
            int residuo = numero%2;
            numero = numero/2;
            return (residuo*(int)(Math.pow(base,exp))+transformar2(numero,base,exp+1));
        }
    }
}
