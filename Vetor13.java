// Durante a contagem de produtos em um estoque, é necessário identificar os proEm um sistema de segurança, é importante identificar números primos para gerar chaves de acesso. Crie um programa que solicite ao usuário inserir um número inteiro N e, em seguida, imprima todos os números primos menores ou iguais a N.

import java.util.Scanner;
public class Vetor13 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);

        // Solicitar ao usuário inserir um número inteiro N
        System.out.print("Digite um número inteiro: ");
        int N = input.nextInt();

        // Imprimir os números primos menores ou iguais a N
        System.out.println("Números primos menores ou iguais a " + N + ":");

        for (int i = 2; i <= N; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
