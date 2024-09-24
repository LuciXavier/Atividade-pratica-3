import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = {6, 15, 3, 51, 351, 16, 53, 495, 651, 47};
        boolean encontrado = false;  
        
        System.out.print("Busque o valor que deseja:");
        int valor = scanner.nextInt();
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {  
                System.out.println("O valor " + valor + " está na " + i + "° posição do vetor.");
                encontrado = true;  
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O valor " + valor + " não foi encontrado.");
        }
        scanner.close(); 
    }
}