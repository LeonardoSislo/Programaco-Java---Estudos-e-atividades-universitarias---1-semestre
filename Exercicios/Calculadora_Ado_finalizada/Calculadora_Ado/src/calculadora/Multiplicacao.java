/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author leonardo.hmsislo
 */
public class Multiplicacao {
    
    double n1 = 0;
    double n2 = 0;
    
         public void mostrarMultiplicacao(double n1, double n2){
             
             this.n1 = n1;
             this.n2 = n2;
             double multiplicaoFeita = this.n1 * this.n2;
             
             System.out.printf("\n O resultado é: %.2f", multiplicaoFeita);
            
             
         }    
    
}