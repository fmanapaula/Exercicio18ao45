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
public class Ex_22 {
    public static void main (String args[]){
        int v1,v2;
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor inteiro, diferente do primeiro"));
        
        if(v1>v2){
            System.out.println(v2+ " e "+ v1+".");
        }
        else{
            System.out.println(v1+" , "+v2 +".");
        }
    }
    
}
