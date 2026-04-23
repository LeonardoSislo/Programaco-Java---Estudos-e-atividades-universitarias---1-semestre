
package calculadora;


public class Calculo {
    
    double n1 = 0;
    double n2 = 0;
    
    public void mostrarSoma(double n1, double n2){
        
        this.n1 = n1;
        this.n2 = n2;
        double somaFeita = this.n1 + this.n2;
        
        System.out.printf("\nA soma de %.2f e %.2f é: %.2f", this.n1, this.n2, somaFeita);
        
        
    }
    
    public void mostrarSubtracao(double n1, double n2){
             
             this.n1 = n1;
             this.n2 = n2;
             double subtracaoFeita = this.n1 - this.n2;
             
             System.out.printf("\n O resultado é: %.2f", subtracaoFeita);
            
             
         }

    
          public void mostrarMultiplicacao(double n1, double n2){
             
             this.n1 = n1;
             this.n2 = n2;
             double multiplicaoFeita = this.n1 * this.n2;
             
             System.out.printf("\n O resultado é: %.2f", multiplicaoFeita);
            
             
         } 
          
          public void mostrarDivisao (double n1, double n2){
             
             this.n1 = n1;
             this.n2 = n2;
             double divisaoFeita = this.n1 / this.n2;
             
             System.out.printf("\n O resultado é: %.2f", divisaoFeita);
            
             
         }    
          
          
           public void mostrarDobro(double n1){
             
             this.n1 = n1;
             double dobroFeito = this.n1 * 2;
             
             System.out.printf("\n O resultado é: %.2f", dobroFeito);
            
             
         }    
           
            public void mostrarPotencia(double n1, double n2){
             
             this.n1 = n1;
             this.n2 = n2;
             double potenciaFeita = Math.pow(this.n1, this.n2);
             
             System.out.printf("\n O resultado é: %.2f", potenciaFeita);
            
             
    }
    
    
}
