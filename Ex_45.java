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
public class Ex_45 {
    public static void main (String args[]){
        double A,B;
        double  serie1,serie2,serie0,C;
        A=0;
        B=0;
        serie1 = 0;
        serie2 = 0;
        
        for (int i = 1; i<=15; i++){
        A = 1+A;
        B = A*A;
        C = A/B;
        if (A%2==1){
            serie1 = serie1 + C;
            System.out.println(serie1);
        }
        else{
            serie2 =  serie2 - C;
            System.out.println(serie2);
        }
        
        }
        serie0 = serie1+serie2;
        JOptionPane.showMessageDialog(null,serie0);
    }
    
    
}
