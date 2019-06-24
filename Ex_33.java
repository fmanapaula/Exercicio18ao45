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
public class Ex_33 {
    public static void main(String args[]){
        int N,C;
        double soma,S,i;
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
        C = 1;
        S = 0;
        soma = 0;
            for ( i =1; i<=N;i++){
            S = C/i;
            soma = soma +S;
            JOptionPane.showMessageDialog(null,S); 
        }
       System.out.println("A soma da série é:"+soma);
    }
    
}
