// Um sistema de gerenciamento de projetos precisa gerar estimativas de prazos com base em sequências de tarefas. Faça um programa que solicite ao usuário inserir um número inteiro positivo N e, em seguida, gere e imprima os N primeiros termos da sequência de Fibonacci, que representa os prazos estimados.


import java.util.Scanner;
public class Vetor15 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);

        // Solicitar ao usuário inserir o número de termos da sequência de Fibonacci
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int N = input.nextInt();

        // Imprimir os N primeiros termos da sequência de Fibonacci
        System.out.println("Os primeiros " + N + " termos da sequência de Fibonacci são:");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

  
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
