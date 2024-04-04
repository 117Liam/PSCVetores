// Em um sistema de monitoramento de temperaturas, é importante identificar a temperatura mais alta registrada. Faça um programa que leia 8 valores de temperatura e, em seguida, encontre e imprima a maior temperatura registrada.


import java.util.Scanner;
public class Vetor18 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);
        double maiorTemperatura = Double.MIN_VALUE;

        // Ler as temperaturas
        System.out.println("Digite as 8 temperaturas:");

        for (int i = 1; i <= 8; i++) {
            System.out.print("Temperatura " + i + ": ");
            double temperatura = input.nextDouble();

            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }
        }

        // Imprimir a maior temperatura registrada
        System.out.println("A maior temperatura registrada é: " + maiorTemperatura);
    }
}
