// Em um sistema de controle acadêmico, é preciso calcular a média das notas dos alunos. Escreva um programa que leia as notas de 10 alunos e, em seguida, calcule e imprima a média dessas notas.


import java.util.Scanner;
public class Vetor17 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);
        int totalAlunos = 10;
        double somaNotas = 0;

        // Ler as notas dos alunos
        System.out.println("Digite as notas dos alunos:");

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.print("Nota do aluno " + i + ": ");
            double nota = input.nextDouble();
            somaNotas += nota;
        }

        // Calcular a média das notas
        double media = somaNotas / totalAlunos;

        // Imprimir a média das notas
        System.out.println("A média das notas dos alunos é: " + media);
    }
}
