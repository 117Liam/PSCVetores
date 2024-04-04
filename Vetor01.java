// Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números primos e suas respectivas posições.

import java.util.Scanner;
public class Vetor01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int i, j, cont = 0;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("Números primos e suas posições:");

        for (i = 0; i < 10; i++) {
            boolean ehPrimo = true;
            if (vetor[i] <= 1) {
                ehPrimo = false;
            } else {
                for (j = 2; j <= Math.sqrt(vetor[i]); j++) {
                    if (vetor[i] % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }
            if (ehPrimo) {
                System.out.println("Número primo: " + vetor[i] + ", Posição: " + (i + 1));
            }
        }
    }
}
