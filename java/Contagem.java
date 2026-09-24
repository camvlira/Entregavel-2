import java.util.Scanner;

public class Contagem {
    void realizarContagem() {
        Scanner dado = new Scanner(System.in);

        System.out.println("Digite o valor de N (quantidade de números): ");
        int n = dado.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            numeros[i] = dado.nextInt();
        }

        int primeiro = numeros[0];
        int ultimo = numeros[n - 1];
        int contador = 0;

        for (int valor : numeros) {
            if (valor >= primeiro && valor <= ultimo) {
                contador++;
            }
        }

        System.out.println("Quantidade de valores entre " + primeiro + " (inclusive) e " + ultimo + " (inclusive): " + contador + "\n");
    }
}
