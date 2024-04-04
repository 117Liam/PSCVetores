// Crie um programa em java para instanciar um vetor de 5 posições de números decimais e encontre o maior valor e o menor valor deste um

import java.util.Scanner;
public class Vetor07 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);
        double[] vetor = new double[5];

        // Preencher o vetor com números decimais 
        System.out.println("Digite os números decimais:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = input.nextDouble();
        }

        // Encontrar o maior e o menor valor no vetor
        double maiorValor = vetor[0];
        double menorValor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }

        // Imprimir o maior e o menor valor
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O menor valor é: " + menorValor);
    }
}
