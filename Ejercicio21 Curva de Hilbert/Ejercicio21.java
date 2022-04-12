public class Ejercicio21{
    public int curvaDeHilbert(int n){
        if(n == 0){
            return 3;
        }else{
            int aux = 1;
            if(n%2 == 0){
                 aux = -1;
            }
            return (curvaDeHilbert(n-1)*4) + aux;
        }
    }
}
