//Escreva um programa em java que preencha um vetor com 20 números inteiros aleatórios entre 1 e 30 e depois verifique se o número 25 existe neste vetor.

import java.util.Scanner;
public class Vetor04 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in); 
        int[] vetor = new int[20];

        // Preencher o vetor com números aleatórios entre 1 e 30
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerarNumeroAleatorio(1, 30);
        }

        System.out.println("Vetor:");
        imprimirVetor(vetor);

        // Verificar se o número 25 existe no vetor
        boolean existe25 = verificarNumero(vetor, 25);

        // Imprimir resultado
        if (existe25) {
            System.out.println("O número 25 existe no vetor.");
        } else {
            System.out.println("O número 25 não existe no vetor.");
        }
    }

    
    public static int gerarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    
    public static boolean verificarNumero(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }


    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}