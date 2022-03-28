public class Ejercicio4{
    public int dividir(int dividendo, int divisor){
        int res;
        if(divisor <= 0){
            res = -1;
        }else{
            if(dividendo < divisor){
                res = 0;
            }else{
                dividendo = dividendo - divisor;
                res = 1+ dividir(dividendo, divisor);
            }
        }
        return res;
    }
    public int dividir2(int dividendo, int divisor){
        if(divisor <= 0){
            return -1;
        }else{
            if(dividendo < divisor){
                return 0;
            }else{
                dividendo = dividendo - divisor;
                return 1+ dividir2(dividendo, divisor);
            }
        }
    }
}
