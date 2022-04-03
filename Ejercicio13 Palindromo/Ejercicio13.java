public class Ejercicio13{
    public String verificarCadena(String cad){
        cad = normalizarCadena(cad);
        int izq = 0;
        int der = cad.length()-1;
        return verificarCadena(cad,izq,der);
    }
    
    private String verificarCadena(String cad, int izq, int der){
        String res;
        if(der<izq){
            res = "Es Palindromo";
        }else{
            char actIzq = cad.charAt(izq);
            char actDer = cad.charAt(der);
            if(actIzq != actDer){
                res = "NO es Palindromo";
            }else{
                res = verificarCadena(cad, izq+1, der-1);
            }
        }
        return res;
    }
    
    private String normalizarCadena(String cad){
        String res = "";
        for(int pos=0; pos<cad.length(); pos++){
            char actual = cad.charAt(pos);
            if(actual != ' ' && actual != ','){
                res = res+actual;
            }
        }
        return res.toLowerCase();
    }
}
