//Escreva um programa em java que crie um vetor com 10 números inteiros aleatórios e depois calcule a média dos elementos deste vetor.

import java.util.Scanner;
public class Vetor03 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        // Preencher o vetor com números aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerarNumeroAleatorio();
        }

        // Cálculo da média dos elementos do vetor
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = (double) soma / vetor.length;

        // Imprimir o vetor
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Imprimir a média
        System.out.println("A média dos elementos é: " + media);
    }

    public static int gerarNumeroAleatorio() {
        return (int) (Math.random() * 100); 
    }
}
