// Crie um programa que irá gerar um vetor A com 15 números inteiros e depois crie um vetor B que será a cópia do vetor A de forma reversa.

import java.util.Scanner;
public class Vetor08 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        // Preencher o vetor A com 15 números inteiros
        System.out.println("Digite 15 números inteiros para preencher o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetorA[i] = input.nextInt();
        }

        // Copiar o vetor A para o vetor B de forma reversa
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[vetorB.length - 1 - i] = vetorA[i];
        }

        // Imprimir vetor A
        System.out.println("Vetor A:");
        imprimirVetor(vetorA);

        // Imprimir vetor B
        System.out.println("Vetor B:");
        imprimirVetor(vetorB);
    }

    // Função para imprimir um vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
