public class Ejercicio5{
    public int multiplicar(int multiplicando, int multiplicador){
        int res;
        if(multiplicador == 0){
            res = 0;
        }else{
            if(multiplicador == 1){
                res = multiplicando;
            }else{
                res = multiplicando + multiplicar(multiplicando,multiplicador-1);
            }
       }
       return res;
    }
}
