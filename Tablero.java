/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman;

/**
 *
 * @author gustavo
 */
public class Tablero {
    
    public char[][] tablero;

    public Tablero(int filas, int columnas) {
        tablero = new char[filas][columnas];
    }
    
    public boolean addBomba(int fila, int columna, int alcance){
        Bomba b = new Bomba(alcance);
        if( tablero[fila][columna] == ' ' ) {
            tablero[fila][columna] = b.getImage();
            return true;
        }
        return false;
    }
    
    
}
