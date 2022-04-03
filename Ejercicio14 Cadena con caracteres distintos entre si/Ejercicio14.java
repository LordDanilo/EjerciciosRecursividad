public class Ejercicio14{
    public boolean verificarCadena(String cad){
        int pos = 0;
        String aux = "";
        return verificarCadena(cad.toLowerCase(),pos,aux);
    }
    private boolean verificarCadena(String cad, int pos, String aux){
        boolean res;
        if(pos == cad.length()){
            res = true;
        }else{
            char actual = cad.charAt(pos);
            if(aux.contains(actual+"")){
                res = false;
            }else{
                aux = aux+actual;
                res = verificarCadena(cad,pos+1,aux);
            }
        }
        return res;
    }
    private boolean verificarCadena2(String cad, int pos, String aux){
        if(pos == cad.length()){
            return true;
        }else{
            char actual = cad.charAt(pos);
            if(aux.contains(actual+"")){
                return false;
            }else{
                aux = aux+actual;
                return verificarCadena2(cad,pos+1,aux);
            }
        }
    }
}
