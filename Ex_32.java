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
public class Ex_32 {
    public static void main(String args[]){
        int N,Q,F;
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para ser fatorado:"));
        
       
        
       Q = 1; 
        for(int i = N; i > 1 ;i--) {
        
        F = i* Q;
        Q = Q*i;
        
           
             
         
    }
        System.out.println("O fatorial é : " + Q );
           
        
    
    }
}
    

