public class Ejercicio24{

    private int contarSectores(char[][] map){
        int cont = 0;
        for(int fila=0; fila<map.length; fila++ ){
            for(int col = 0; col<map[fila].length; col++){
                if(map[fila][col] == ' '){
                    regar(fila,col,map);
                    cont++;
                }
            }
        }
        return cont;
    }

    private void regar(int fila, int col, char[][] map){
        if(esValida(fila,col,map) && map[fila][col] == ' '){
            map[fila][col] = 'R';
            regar(fila, col+1, map);//derecha
            regar(fila, col-1, map);//izquierda
            regar(fila-1, col, map);//arriba
            regar(fila+1, col, map);//abajo
            regar(fila-1,col+1, map);//digDerSup
            regar(fila+1,col+1, map);//diagDerInf
            regar(fila-1,col-1, map);//diagIzqSup
            regar(fila+1,col-1, map);//diagIzqInf
        }
    }

    private boolean esValida(int fila, int col, char[][]map){
        return fila>=0 && fila<map.length && col>=0 && col<map[fila].length;
    }

    public static void main(String args[]){
        char[][] map = {{' ',' ',' ','W',' ',' '},
                        {' ','W','W','W','W',' '},
                        {' ','W',' ',' ','W',' '},
                        {'W','W','W',' ','W',' '},
                        {' ',' ','W',' ','W','W'},
                        {' ',' ','W',' ','W',' '}};
        Ejercicio24 e24 = new Ejercicio24();

        System.out.println(e24.contarSectores(map));
    }
}
