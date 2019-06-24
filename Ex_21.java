/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulakanae
 */
import  javax.swing.JOptionPane;
public class Ex_21 {
    public static void main (String args[]){
        double n1,n2,n3,n4,M;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do aluno:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota do aluno:"));
        
        {
            M = (n1+n2+n3+n4)/4;
        }
        
        if (M>=6){
            System.out.println("APROVADO!PARABÉNS!");
           }
        
        else if(M>=3){
            System.out.println("EXAME");
            }
        
        else{
            System.out.println("RETIDO!");
        }
    }
    
}
