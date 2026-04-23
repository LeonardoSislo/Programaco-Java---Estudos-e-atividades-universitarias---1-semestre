
package calculadora;

import java.util.Scanner;


public class Principal_Calculadora {

    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        String continuar = "S";

        do{
        System.out.print("=== Calculadora ===\n 1 - Somar\n 2 - Substrair\n 3 - Multiplicar\n 4 - Dividir\n 5 - Dobrar\n 6 - Exponenciar\n 7 - Sair\n\n Escolha uma opção: ");
        
             //Mensagem que aparece para o usuário
        int op = scan.nextInt(); //Declaração da variável para controle
        //scan.nextInt atalho usado da classe Scanner, para ler o que a pessoa digitar
        
        
            switch (op){ //Início da estrutura switch
                case 1:{ //Primeiro caso
                    System.out.print("Você escolheu a opção Soma, digite o primeiro número: ");
                    double n1 = scan.nextDouble();
                    System.out.print("Agora digite o segundo número: ");
                    double n2 = scan.nextDouble();
                    
                    Calculo ca = new Calculo();
                    ca.mostrarSoma(n1, n2);
                        
                    break; //Saída da condicional switch
                }
                
                
                case 2:{
                    System.out.print("Você escolheu a opção Subtrair, digite o primeiro número: ");
                    double n1 = scan.nextDouble();
                    System.out.print("Agora digite o segundo número: ");
                    double n2 = scan.nextDouble();
                    
                    Calculo ca = new Calculo();
                    ca.mostrarSubtracao(n1, n2);
                    
                    break;
                }
                
                 
                case 3:{
                    System.out.print("Você escolheu a opção Multiplicar, digite o primeiro número: ");
                    double n1 = scan.nextDouble();
                    System.out.print("Agora digite o segundo número: ");
                    double n2 = scan.nextDouble();
                    
                    Calculo ca = new Calculo();
                    ca.mostrarMultiplicacao(n1, n2);
                    
                    
                    break;
                } 
                
                 case 4:{
                    System.out.print("Você escolheu a opção Dividir, digite o número: ");
                    double n1 = scan.nextDouble();
                    System.out.print("Dividido por: ");
                    double n2 = scan.nextDouble();
                    
                    Calculo ca = new Calculo();
                    ca.mostrarDivisao(n1, n2);
                    
                    break;
                 }
                 
                 case 5:{
                    System.out.print("Você escolheu a opção Dobrar, digite o número: ");
                    double n1 = scan.nextDouble();
                   
                    Calculo ca = new Calculo();
                    ca.mostrarDobro(n1);
                    
                    break;
                 }
                 
                 case 6:{
                    System.out.print("Você escolheu a opção Exponenciação, digite a base: ");
                    double n1 = scan.nextDouble();
                    System.out.print("Digite o expoente: ");
                    double n2 = scan.nextDouble();
                    
                    Calculo ca = new Calculo();
                    ca.mostrarPotencia(n1, n2);
                    
                    break;
                 }
                 
            
                
                 case 7:{
                    System.out.println("Você escolheu a opção Sair");
                    break;
                 }
                 
                default: //opção padrão, termina todas as opções switch, se for digitado diferente, irá cair nessa
                    System.out.println("Opção inválida!");
            }
            
            System.out.print("\nDeseja fazer outra operação? (S/N): ");
            continuar = scan.next();
            
            
             } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\nObrigado por usar a calculadora DLW! Até a próxima Martinelle!");
            
        scan.close();//Fecha o objeto
            

       
        
    }
    
}
