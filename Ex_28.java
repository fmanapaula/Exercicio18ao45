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
public class Ex_28{ 
        public static void main(String args[]){
            double Patual, Mmensal,Pnovo;
            Patual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual do produto:"));
            Mmensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a média mensal do produto:"));
            
            if(Mmensal<500 && Patual<30){
                Pnovo = Patual + (Patual*0.10);
                System.out.println("O produto teve um aumento de 10%, totalizando em:"+Pnovo+" reais.");
            }
            else if(Mmensal>=500 && Mmensal <1000 && Patual>=30 && Patual< 80){
                Pnovo = Patual + (Patual*0.15);
                System.out.println("O produto teve um aumento de 15%, totalizando em:"+Pnovo+" reais.");
            }
            else{
                Pnovo = Patual - (Patual*0.05);
                System.out.println("O produto teve um desconto de 5%, totalizando em:"+Pnovo+" reais.");
            }                
            

                
            
                
            
        
        }


    
}
