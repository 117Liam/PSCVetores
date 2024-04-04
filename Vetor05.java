//Escreva um programa em java que preencha um vetor com 15 números inteiros aleatórios entre 1 e 50. Verifique se o número 20 existe nesse vetor e retorne seu índice caso ele exista. 

import java.util.Scanner;
  public class Vetor05 {
      public static void main(String[] args) {
          // Declarar variáveis
          Scanner input = new Scanner(System.in);
          int[] vetor = new int[15];

          // Preencher o vetor com números aleatórios entre 1 e 50
          for (int i = 0; i < vetor.length; i++) {
              vetor[i] = gerarNumeroAleatorio(1, 50);
          }

          // Imprimir o vetor
          System.out.println("Vetor:");
          imprimirVetor(vetor);

          // Verificar se o número 20 existe 
          int indice = verificarNumero(vetor, 20);

          // Imprimir resultado
          if (indice != -1) {
              System.out.println("O número 20 existe no vetor e está na posição: " + indice);
          } else {
              System.out.println("O número 20 não existe no vetor.");
          }
      }

      public static int gerarNumeroAleatorio(int min, int max) {
          return (int) (Math.random() * (max - min + 1)) + min;
      }

      public static int verificarNumero(int[] vetor, int numero) {
          for (int i = 0; i < vetor.length; i++) {
              if (vetor[i] == numero) {
                  return i;
              }
          }
          return -1; 
      } 
       public static void imprimirVetor(int[] vetor) {
          for (int i = 0; i < vetor.length; i++) {
              System.out.print(vetor[i] + " ");
          }
          System.out.println();
      }
  }
