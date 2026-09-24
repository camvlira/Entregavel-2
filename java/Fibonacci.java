import java.util.Scanner;

public class Fibonacci{
    void gerarFibonacci(){
        Scanner dado = new Scanner(System.in);
        System.out.println("Sequência de Fibonacci.");
        int n;

        do{
            System.out.println("Digite quantos termos deseja gerar (N > 1): ");
            n = dado.nextInt();
            if (n <= 1) {
                System.out.println("N precisa ser maior que 1. Tente novamente.");
            }
        }while (n <= 1);

        int a = 0, b = 1;

        System.out.print("Sequência: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println("\n");
    }
}