/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, par=0, media, impar=0, acima=0, total=0, cont=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número <br>(valor 0 interrompe)</html>"));
            total += n;
            cont += 1;
            if (n >= 100){
                acima +=1;
            }
            media = total / cont ;
           
            if (n % 2 == 0){
                par++;
            } else {
                impar++;
            }
        } while (n != 0);
        JOptionPane.showMessageDialog(null,
                "<html>Resultado: <hr>" +
                "<br>Somatoria dos Valores: " + total +
                "<br>Total de Valores: " + cont +
                "<br>Total de Pares: " + par +
                "<br>Total de Impares: " + impar +
                "<br>Acima de 100: " + acima +
                "<br>Média dos valores: " + media +
                "</html>",
                "Resultado Final",JOptionPane.WARNING_MESSAGE);
    }
    
}
