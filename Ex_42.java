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
public class Ex_42 {
    public static void main (String args[]){
        double A,B;
        double serie,C;
        
        A=0;
        B=-1;
        
        serie = 0;
        for( int i = 1; i<=50; i++){
            C = A/B;
            A = A + 1;
            B = B + 2;
            serie = serie + C;
            System.out.println(serie);
        }
        
        
      
        
        
             
         
          
    
  

        
    }
}