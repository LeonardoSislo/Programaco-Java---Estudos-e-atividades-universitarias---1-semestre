
package calculadora;


public class Soma {
    
    double n1 = 0;
    double n2 = 0;
    
    public void mostrarSoma(double n1, double n2){
        
        this.n1 = n1;
        this.n2 = n2;
        double somaFeita = this.n1 + this.n2;
        
        System.out.printf("\nO resultado é: %.2f", somaFeita);
        
        
    }
}
