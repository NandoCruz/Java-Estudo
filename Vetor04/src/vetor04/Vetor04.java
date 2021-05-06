/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author nando
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {2, 0, 3, 9};
        v[v[2]] = v[v[1]];
        for (int i:v){
            System.out.print(i + " ");
        }
       /* System.out.println("");
        int pos = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição "+pos);*/
    }
    
}
