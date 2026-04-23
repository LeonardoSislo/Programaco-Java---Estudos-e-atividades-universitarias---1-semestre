
package vetor_menor_maior;
import java.util.Arrays;
import java.util.Scanner;

public class Principal_Menor_Maior {

    
    
    public static void main(String[] args) {
       
        Scanner lerDados = new Scanner(System.in);
        
        System.out.print("Informe o tamanho: ");
        int tam = lerDados.nextInt();
        
        int vet[] = new int[tam];
        
        // [i] variável dentro do conchete, apontando pro conteúdo dentro do índice | i variável aponta para o índice 
        
      
        
        //Populando o vetor 
        for(int i = 0; i < vet.length; i++){              //Posição do valor   //Tamanho do vetor
            System.out.printf("Informe %d° valor de %d: ",     i + 1,             vet.length);
            vet[i] = lerDados.nextInt(); //Entrada que o vetor vai receber
          }
        
        // Depois que termina as informações dos vetores, ai sim é feito, por isso está depois da chave de "Popular vetor"
        int soma = 0; 
        int menor = vet[0]; //vet[] = posição do índice |   vet[0] pois está comparando com o índice 0 do vetor
        int maior = vet[0];
        
        
        //Descobrir a soma, o menor valor e o maior valor           //vet.lenght = vetor em sua totalidade
        for(int i = 0; i < vet.length; i++ ){
            soma += vet[i]; // Somatório  ---- vet[i] vai receber o que o usuário digitou
            
            if(vet[i] < menor){
                menor = vet[i]; //Novo menor               
            }
            
            if(vet[i] > maior){
                maior = vet[i]; // Novo maior
            }
        
        }
        
        //Saída de todos os resultados 
        System.out.println("\n\t\t - Saídas -\n");
        
        for (int i = 0; i < vet.length; i++) {
            
            if (vet[i] == menor) {
                System.out.printf("vet[%d] = %d <---- menor valor\n", i, vet[i]);
            } else if (vet[i] == maior) {
                System.out.printf("vet[%d] = %d <---- maior valor\n", i, vet[i]);
            } else {
                System.out.printf("vet[%d] = %d\n", i, vet[i]);
            }
        }
        System.out.printf("%d é a soma dos valores.\n", soma);
        
        System.out.println("\n");
        
         for(int numero: vet){
              System.out.println(numero);
          }
         
                   
          System.out.println("\n");
          
          // Usado para imprimir um nº como objeto -- Somente imprimir, não dá para efetuar calculo
          System.out.println(Arrays.toString(vet));
        
        lerDados.close();
    
    }
    
}
