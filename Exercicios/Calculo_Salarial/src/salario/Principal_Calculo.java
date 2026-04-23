package salario;

import java.util.Scanner;

public class Principal_Calculo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Para a pessoa digitar a quantidade de salários
        System.out.print("Informe a quantidade de salários: ");
        int tamanho = ler.nextInt();

        //Definindo o salário
        double salarios[] = new double[tamanho];

        //Populando o vetor
        for (int i = 0; i < salarios.length; i++) {

            System.out.format("\nInforme o %dº salário: ", i + 1);
            salarios[i] = ler.nextDouble();
        }
        
        

        //Listando os salários
        System.out.println("\nSalários:\n");
        
        for (int i = 0; i < salarios.length; i++) {
            System.out.format("%dº salário: %.2f\n", i+1, salarios[i]);
        }
        
        
         //Listando os salários calculados o reajuste de 15%
        System.out.println("\nSalários reajustados:\n");

        for (int i = 0; i < salarios.length; i++) {
            System.out.printf("%dº salário reajustado: %.2f\n", i+1, salarios[i] * 1.15);
        }
        
        ler.close();//fechando a entrada do teclado
    }
}
