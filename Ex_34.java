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
public class Ex_34 {
    public static void main(String args[]){
        int N,T;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
        
        for(int i = 0; i<= 10; i++){
           T = i* N;
           JOptionPane.showMessageDialog(null,N+" x "+ i +" = "+T);
        }
    }
    
}
