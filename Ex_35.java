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
public class Ex_35 {
    public static void main (String args[]){
        int N1,N2,Simpar;
        
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digidte o 1o. valor:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o. valor:"));
        Simpar = 0;
        if (N1>N2){
            for( int i = N2; i <=N1; i++){
                if (i % 2 == 1){
                    Simpar = (i +Simpar);
                }
            }
        }
                
        else{
            for( int i = N1; i <=N2; i++){
                if (i % 2 == 1){
                    Simpar = (i+Simpar);
                }
            }
        }
                
                System.out.println("A soma dos números ímpares é: "+Simpar);
                            
        
                
            
        
    }

    }
