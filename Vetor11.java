// Um laboratório de pesquisa coleta dados de temperatura em diferentes regiões. Escreva um programa que solicite ao usuário digitar 10 valores de temperatura e, em seguida, calcule e imprima a temperatura média dessas regiões.

import java.util.Scanner;
public class Vetor11 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);
        int quantidadeRegioes = 10;
        double somaTemperaturas = 0;

        // Solicitar ao usuário as temperaturas das regiões
        System.out.println("Digite as temperaturas das 10 regiões:");

        for (int i = 1; i <= quantidadeRegioes; i++) {
            System.out.print("Temperatura da região " + i + ": ");
            double temperatura = input.nextDouble();
            somaTemperaturas += temperatura;
        }

        // Calcular a temperatura média
        double temperaturaMedia = somaTemperaturas / quantidadeRegioes;

        // Imprimir a temperatura média
        System.out.println("A temperatura média das regiões é: " + temperaturaMedia);
    }
}
