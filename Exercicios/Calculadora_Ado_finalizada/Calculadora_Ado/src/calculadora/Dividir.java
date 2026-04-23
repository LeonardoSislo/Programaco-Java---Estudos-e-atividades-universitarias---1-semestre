
package calculadora;

public class Dividir {
    
    double n1 = 0;
    double n2 = 0;
    
         public void mostrarDivisao (double n1, double n2){
             
             this.n1 = n1;
             this.n2 = n2;
             double divisaoFeita = this.n1 / this.n2;
             
             System.out.printf("\n O resultado é: %.2f", divisaoFeita);
            
             
         }    
    
}