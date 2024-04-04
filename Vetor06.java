import java.util.Scanner;
public class Vetor06 {
    public static void main(String[] args) {
        // Declarar variáveis
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[30];

        // Preencher o vetor com números aleatórios entre 1 e 100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerarNumeroAleatorio(1, 100);
        }

        // Imprimir o vetor antes de remover o valor
        System.out.println("Vetor antes da remoção:");
        imprimirVetor(vetor);

        // Pedir ao usuário para digitar um valor a ser removido
        System.out.print("Digite o valor a ser removido: ");
        int valor = input.nextInt();

        // Verificar se o valor existe no vetor e remover
        vetor = removerValor(vetor, valor);

        // Imprimir o vetor após a remoção
        System.out.println("Vetor após a remoção:");
        imprimirVetor(vetor);
    }

    public static int gerarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static int[] removerValor(int[] vetor, int valor) {
        int tamanhoNovoVetor = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != valor) {
                tamanhoNovoVetor++;
            }
        }

        int[] novoVetor = new int[tamanhoNovoVetor];
        int index = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != valor) {
                novoVetor[index++] = vetor[i];
            }
        }
        return novoVetor;
    }
}

       