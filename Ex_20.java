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
public class Ex_20 {
    public static void main (String args []){
        int A,B,C;
        double delta, x1,x2;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o. valor inteiro:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o. valor inteiro:"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3o. valor inteiro:"));
        {
            delta = (B*B)- (4*A*C);
        }
        
        if (delta<0){
                    System.out.println(" Não há raízes!");
                    }
        else if (delta>0){
                    x1 = ((-B) + Math.sqrt(delta))/2*A;
                    x2 = ((-B) - Math.sqrt(delta))/2*A;
                    System.out.println("As raízes são: "+ x1+","+x2+".");
                    }
        else{
            x1 = (-B)/(2*A);
            System.out.println("Só existe uma raíz: "+x1+".");
            }
           
    }
        
         
    
    
}
