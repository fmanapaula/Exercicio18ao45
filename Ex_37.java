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
public class Ex_37 {
    public static void main (String args[]){
        int Anterior,Atual,serie;
        
        serie = 0;
        Anterior = -1;
        Atual = 1;
        
        for (int i = 1; i<=9; i++){
         serie = Atual + Anterior;
         Anterior = Atual;
         Atual = serie;
        }
        System.out.println(serie);
    }
    
}
