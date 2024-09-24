import java.util.Scanner;

public class Soma {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[][] matriz = new double[3][3];
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Digite o valor para a linha [" + i + "]" + " e Coluna [" + j + "]: ");
                    matriz[i][j] = scanner.nextDouble();
                }
            }
            
            int Numlinha = 0;
            for (double[] linha : matriz) { 
                double soma = 0; 
                for (double valor : linha) {
                    soma += valor;
                }
                System.out.println("A soma dos elementos da " + Numlinha + "° linha é: " + soma);
                Numlinha++;  // Incrementa o contador de linha
            }
        }
    }