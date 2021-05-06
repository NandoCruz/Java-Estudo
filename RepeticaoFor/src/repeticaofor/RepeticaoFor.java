/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author nando
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        for (int cc=0; cc<=100; cc+=10){
            System.out.println("Cambalhota: " + cc);
        }
        for (int cc=100; cc>=0; cc-=10){
            System.out.println("voltando: " + cc);
        }
        */
        
        for (int i = 0; i <= 15; i += 2){
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
    
}
