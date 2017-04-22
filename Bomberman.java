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
public class Bomberman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bomba b = new Bomba(2);
        //b.detonar();
        System.out.println(b.getImage());
        System.out.println(b.getAlcance());
        
    }
    
}
