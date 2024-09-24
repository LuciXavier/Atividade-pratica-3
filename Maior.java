import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para a linha [" + i + "]" + " e Coluna [" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int maior = matriz[0][0]; 
        for (int[] linha : matriz) { 
            for (int valor : linha) {  
                if (valor > maior) {  
                    maior = valor;  
                }
            }
        }
        
        System.out.println("O maior valor na matriz é: " + maior); 
        
        scanner.close();
}
}