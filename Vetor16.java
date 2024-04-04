// Em uma pesquisa de opinião, é necessário registrar as respostas dos entrevistados. Crie um programa que leia 5 respostas (números inteiros) de entrevistados e, em seguida, imprima essas respostas na ordem inversa em que foram registradas.


import java.util.Scanner;
public class Vetor16 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);
        int[] respostas = new int[5];

        // Ler as respostas dos entrevistados
        System.out.println("Digite as respostas dos entrevistados:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Resposta " + (i + 1) + ": ");
            respostas[i] = input.nextInt();
        }

        // Imprimir as respostas na ordem inversa
        System.out.println("Respostas invertidas:");

        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.println(respostas[i]);
        }
    }
}
