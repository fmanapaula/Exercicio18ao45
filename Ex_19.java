/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulakanae
 */
import javax.swing.JOptionPane;
public class Ex_19 {
    public static void main (String args[]){
        double n1,n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1o. valor real:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2o. valor real(que seja diferente do 1o. valor):"));
        
        if(n1>n2){
                 System.out.println("O maior número é:"+n1);
                 }
        else{
            System.out.println("O maior número é: "+n2);
            }
               
    }
    
}
