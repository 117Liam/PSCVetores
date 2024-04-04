// Em uma fábrica, é necessário calcular o tempo de produção de um produto com base no número de etapas necessárias. Escreva um programa que leia um número inteiro positivo correspondente ao número de etapas de produção e, em seguida, calcule e imprima o tempo total de produção. Considere que cada etapa de produção tem a duração de 30 minutos.

import java.util.Scanner;
public class Vetor14 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);

        // Solicitar ao usuário inserir o número de etapas de produção
        System.out.print("Digite o número de etapas de produção: ");
        int numEtapas = input.nextInt();

        // Calcular o tempo total de produção
        int tempoTotal = numEtapas * 30; // Cada etapa tem a duração de 30 minutos

        // Imprimir o tempo total de produção
        System.out.println("O tempo total de produção é de " + tempoTotal + " minutos.");
    }
}
