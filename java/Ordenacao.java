import java.util.Scanner;

public class Ordenacao {
    void ordenarNumeros(){
        Scanner dado = new Scanner(System.in);

        System.out.println("Ordenação de números (Quicksort).");
        System.out.println("Digite quantos números deseja ordenar: ");
        int n = dado.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            numeros[i] = dado.nextInt();
        }

        quicksort(numeros, 0, n - 1);

        System.out.print("Números ordenados: ");
        for(int num : numeros){
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    private void quicksort(int[] arr, int inicio, int fim){
        if (inicio < fim) {
            int posPivo = particionar(arr, inicio, fim);
            quicksort(arr, inicio, posPivo - 1);
            quicksort(arr, posPivo + 1, fim);
        }
    }

    private int particionar(int[] arr, int inicio, int fim){
        int pivo = arr[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;

        return i + 1;
    }
}