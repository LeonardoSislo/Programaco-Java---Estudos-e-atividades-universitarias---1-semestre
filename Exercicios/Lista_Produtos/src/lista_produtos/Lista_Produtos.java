
package lista_produtos;

import java.util.Scanner;


public class Lista_Produtos {
   
    
    public static void main(String[] args) {
        
          Scanner scan = new Scanner(System.in);
        
          
            System.out.print("Bem vindo!\nDigite o nome do produto: ");
            String produto = scan.nextLine();
            
            System.out.print("Digite o peso: ");
            double peso = scan.nextFloat();
            
             System.out.print("Digite o valor do Kg: ");
            double valor = scan.nextFloat();
            
                double precoFinal = peso * valor;
 
            
            System.out.printf("\n Produto: %s\nPeso: %.2f\nValor(Kg): %.2f\nPreço final = %.2f", produto, peso, valor, precoFinal);
        
            scan.close();
    }
    
}
    

