
package vetor_como_param;

import java.util.Arrays;


public class Vet_Param {
    
    public void imprimirVetor(int vet[]){
        
        //  "Arrays.toString" usado sempre para imprimir texto
        System.out.println(Arrays.toString(vet));
        }
    
     public void imprimirVetor2(int vet[]){
        
         //Para imprimir os valores reais que estão no vetor
        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " - ");
            
            }
         System.out.println("\n");
     }
     
     
}
