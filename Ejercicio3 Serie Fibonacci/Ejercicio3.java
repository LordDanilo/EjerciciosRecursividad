public class Ejercicio3{
    public int fibo(int n){
        int res;
        if(n==0){
            res = 0;
        }else{
            if(n==1){
                res = 1;
            }else{
                res = fibo(n-1)+fibo(n-2);
            }
        }
        return res;
    }
    
    public int fibo2(int n){
        if(n==0){
            return 0;
        }else{
            if(n==1){
                return 1;
            }else{
                return fibo2(n-1)+fibo2(n-2);
            }
        }
    }
}
