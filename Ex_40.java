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
public class Ex_40 {
    public static void main(String args[]){
        int N1,N2,C;
        double i,j;
        
        
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o. número:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o. número:"));
        
        
        C = 0;
        
        if(N2>N1){
            for ( i = N1; i<=N2; i++){
                C = 0;
                for( j = 1; j<=i; j++){
                    if (i%j ==0){
                        C = C + 1;
                    }
                        
                        
                    
                }
                if (C==2){
                     JOptionPane.showMessageDialog(null,"São primos: "+i);      
                        }
        }
            
            
        
        
        
    }
        else{
            for ( i = N2; i<=N1; i++){
                C = 0;
                for( j = 1; j<=i; j++){
                    if (i%j ==0){
                        C = C + 1;
                        
                    }
                }
        
                if (C==2){
                    JOptionPane.showMessageDialog(null,"São primos: "+i);         
                        }
            }

        }    
    }
}        
       