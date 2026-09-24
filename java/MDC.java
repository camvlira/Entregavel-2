import java.util.Scanner;

public class MDC{
    void calcularMDC(){
        Scanner dado = new Scanner(System.in);

        System.out.println("Cálculo do MDC.");

        System.out.println("Digite o primeiro número: ");
        int a = dado.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = dado.nextInt();

        int x = a, y = b;

        while (y != 0) {
            int resto = x % y;
            x = y;
            y = resto;
        }

        System.out.println("O MDC entre " + a + " e " + b + " é " + x + ".\n");
    }
}