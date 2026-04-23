
package calculadora;

public class Exponenciacao {
    
    double n1 = 0;
    double n2 = 0;
    
         public void mostrarPotencia(double n1, double n2){
             
             this.n1 = n1;
             this.n2 = n2;
             double potenciaFeita = Math.pow(this.n1, this.n2);
             
             System.out.printf("\n O resultado é: %.2f", potenciaFeita);
            
             
    }


}