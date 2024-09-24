import java.util.Arrays;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Num = new int[10];
        
        for (int i = 0; i < Num.length; i++) {
            System.out.print("Digite o " + i + "º valor:"  );
            Num[i] = scanner.nextInt();
        }
        
        System.out.println("\n\nValores do vetor:");
        for (int valor : Num) {
            System.out.print(valor + " ");
        }
        
        Arrays.sort(Num);
        System.out.println("\n\nValores do vetor em ordem crescente:");
        for (int valor : Num) {
            System.out.print(valor + " ");
        }
        
        System.out.println("\n\nValores do vetor em ordem decrescente:");
        for (int i = Num.length - 1; i >= 0; i--) {
            System.out.print(Num[i] + " ");
        }


        scanner.close();
    }
}