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
public class Bomba {
    
    private int alcance;
    private boolean isDetonada;
    private char ACTIVA = 'O';
    private char DETONADA = 'X';

    public Bomba(int alcance) {
        this.alcance = alcance;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public boolean isDetonada() {
        return isDetonada;
    }

    public void detonar() {
        this.isDetonada = true;
    }
    
    public char getImage(){
        return isDetonada ? DETONADA : ACTIVA;
    }
    
}
