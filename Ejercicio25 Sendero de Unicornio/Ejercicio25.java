public class Ejercicio25{
    private int buscarSenderoLargo(char[][] map){
        int res = 0;
        for(int fila = 0; fila<map.length; fila++){
            for(int col = 0; col<map[fila].length; col++){
                if(map[fila][col] == 'U'){
                    int parcial = contarCamino(fila,col,map);
                    if(parcial > res){
                        res = parcial;
                    }
                }
            }
        }
        return res;
    }

    private int contarCamino(int fila, int col, char[][] map){
        int res;
        if(esValido(fila,col,map) && map[fila][col] == 'U'){
            map[fila][col] = 'X';
            int der = 1+contarCamino(fila,col+1,map);
            int izq = 1+contarCamino(fila,col-1,map);
            int arriba = 1+contarCamino(fila-1, col, map);
            int abajo  = 1+contarCamino(fila+1, col, map);

            int m1 = Math.max(der,izq);
            int m2 = Math.max(arriba,abajo);

            res = Math.max(m1,m2);
            map[fila][col] = 'U';
        }else{
            res = 0;
        }
        return res;
    }

    private boolean esValido(int fila, int col, char[][] map){
        return fila>=0 && fila<map.length && col>=0 && col<map[fila].length;
    }

    public static void main(String args[]){
        char[][] map = {{'B','B','B','B','B','B','B','B'},
                        {'B','U','U','U','U','U','B','B'},
                        {'B','U','B','B','B','B','U','U'},
                        {'B','B','B','U','U','B','B','B'},
                        {'B','B','B','U','B','U','B','B'},
                        {'B','B','U','U','B','U','U','B'},
                        {'B','B','B','B','B','U','B','B'}};
                        
        Ejercicio25 e25 = new Ejercicio25();
        System.out.println(e25.buscarSenderoLargo(map));
    }
}
