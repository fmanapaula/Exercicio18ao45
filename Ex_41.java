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
public class Ex_41 {
    public static void main(String args[]){
        int dado;
        
        dado = 0;
        
        
        for(int i = 1;i<=7;i++){
            dado = 0;
         for( int j = 1; j<=7;j++){
             dado = i+j;
             if (dado ==7){
                 JOptionPane.showMessageDialog(null,i +" e "+ j +".");
             }
            
         }
          
        }
         
          
    }
    
}
