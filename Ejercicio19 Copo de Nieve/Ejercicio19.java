public class Ejercicio19{
    public int copoDeNieve(int n){
        if(n == 0){
            return 3;
        }else{
            return copoDeNieve(n-1) + (3*(int)Math.pow(2,2*(n-1)));
        }
    }
}
