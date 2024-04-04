// Em uma escola, os professores precisam ensinar a tabuada aos alunos. Crie um programa que peça ao usuário inserir um número inteiro correspondente à tabuada desejada e, em seguida, imprima a tabuada desse número até 10.

import java.util.Scanner;
public class Vetor10 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);

        // Solicitar ao usuário o número para a tabuada
        System.out.print("Digite um número inteiro para a tabuada: ");
        int numero = input.nextInt();

        // Imprimir a tabuada do número fornecido até 10
        System.out.println("Tabuada do número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
