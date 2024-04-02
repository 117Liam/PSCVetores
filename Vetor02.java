// Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.

import java.util.Scanner;
public class Vetor02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] vetor3 = new int[20];
    int i, j, k;

    for (i = 0; i < 10; i++) {
      System.out.print("Digite o " + (i + 1) + "º número do primeiro vetor: ");
      vetor1[i] = input.nextInt();
    }

    for (j = 0; j < 10; j++) {
      System.out.print("Digite o " + (j + 1) + "º número do segundo vetor: ");
      vetor2[j] = input.nextInt();
    }

    k = 0;
    i = 0;
    j = 0;

    while (i < 10 && j < 10) {
      vetor3[k++] = vetor1[i++];
      vetor3[k++] = vetor2[j++];
    }

    while (i < 10) {
      vetor3[k++] = vetor1[i++];
    }

    while (j < 10) {
      vetor3[k++] = vetor2[j++];
    }

    System.out.println("Vetor intercalado:");
    for (k = 0; k < 20; k++) {
      System.out.print(vetor3[k] + " ");
    }
  }
}