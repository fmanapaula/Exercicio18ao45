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
public class Ex_44 {
    public static void main (String args[]){
        int base,exp;
        double resultado;
        
            
                
        base = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de base:"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de expoente do número:"));
        
        resultado = Math.pow(base,exp);
        
        System.out.println("O valor é: "+resultado);
        
    }
}
