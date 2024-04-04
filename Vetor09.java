// Em um sistema de vendas, é necessário imprimir os recibos para os clientes. Escreva um programa que solicite ao usuário digitar a quantidade de recibos que deseja imprimir e, em seguida, imprima os números dos recibos de 1 até o número desejado utilizando um loop while.

import java.util.Scanner;
public class Vetor09 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);

        // Solicitar ao usuário a quantidade de recibos a serem impressos
        System.out.print("Digite a quantidade de recibos a serem impressos: ");
        int quantidadeRecibos = input.nextInt();

        // Inicializar o contador
        int contador = 1;

        // Imprimir os números dos recibos 
        System.out.println("Recibos impressos:");

        while (contador <= quantidadeRecibos) {
            System.out.println("Recibo " + contador);
            contador++;
        }
    }
}
