import java.util.Scanner;

public class Somatorio{
    void calcularSomatorio(){
        Scanner dado = new Scanner(System.in);

        System.out.println("Cálculo de Somatório.");
        System.out.println("Digite quantos números deseja somar: ");
        int n = dado.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o número " + i + ": ");
            int valor = dado.nextInt();
            soma += valor;
        }

        System.out.println("A soma do conjunto é " + soma + ".\n");
    }
}