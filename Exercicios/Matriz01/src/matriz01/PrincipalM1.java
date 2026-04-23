

package matriz01;

import java.util.Scanner;


public class PrincipalM1 {

    
    
    public static void main(String[] args) {
      
       Scanner ler = new Scanner(System.in);
        
       
        int matriz[][] = new int[2][4];
        
        //matriz.lenght -- indica a quantidade de linhas 
        //matriz[i].lenght -- indica a quantidade de cols. da i~ézima lin.
        
        //Laço para popular
        for(int i = 0; i < matriz.length; i++){
           System.out.printf("Informe os elementos da %dª linha\n", i + 1);
                
                    for(int j = 0; j < matriz[i].length; j++){
                       System.out.printf("m[%d] [%d]: ", i, j);
                       matriz[i][j] = ler.nextInt();
                 }//quebra de linha
                     System.out.println("");
         }
        
        //Laço para imprimir
        for(int i = 0; i < matriz.length; i++){
            
            System.out.printf("%dª linha -\n", i+1);
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.printf("%d -", matriz[i] [j]);
            }
         System.out.println("");
        }
    }
    
}
