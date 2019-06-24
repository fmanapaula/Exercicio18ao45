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
public class Ex_38 {
    public static void main(String args[]){
        int N,Nmaior,Nmenor;
        
       Nmaior = 0;
       
       N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
       Nmenor = N;
       
       for(int i= 1; i<=99; i++){
           N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
           if (N>Nmaior){
               Nmaior = N;
           }
           else if(N<Nmenor){
               Nmenor = N;
           }
       }
       System.out.println("O número meno é: "+Nmenor+" .O número maior é: "+Nmaior);
    }
    
}
