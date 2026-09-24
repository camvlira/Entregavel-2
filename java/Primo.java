import java.util.Scanner;

public class Primo{
    void verificarPrimo(){
        Scanner dado = new Scanner(System.in);

        System.out.println("Verificação de Primo.");
        System.out.println("Digite um número: ");
        int n = dado.nextInt();

        boolean ehPrimo = true;

        if (n <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        if(ehPrimo){
            System.out.println("O número " + n + " é primo.\n");
        }else{
            System.out.println("O número " + n + " não é primo.\n");
        }
    }
}