public class Ejercicio11{
    public int contarOcurrencias(char buscado, String cad){
        int pos = 0;
        return contarOcurrencias(buscado,cad,pos);
    }
    private int contarOcurrencias(char buscado, String cad, int pos){
        int res;
        if(pos == cad.length()){
            res = 0;
        }else{
            char actual = cad.charAt(pos);
            int aux = 0;
            if(actual == buscado){
                aux = 1;
            }
            res = aux+contarOcurrencias(buscado,cad,pos+1);
        }
        return res;
    }
}
