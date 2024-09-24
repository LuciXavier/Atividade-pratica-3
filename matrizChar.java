public class matrizChar {
    public static void main(String[] args) {
        
        char[][] nome = {
            {'L', 'u', 'c', 'i'},
            {'a', 'n', 'a', ' '},
            {'d', 'e', ' ', 'S'},
            {'o', 'u', 's', 'a'},
            {' ', 'X', 'a', 'v'},
            {'i', 'e', 'r', ' '},
        };

        for (char[] linha : nome) { 
            for (char coluna : linha) {  
                System.out.print(coluna);  
            }  
        }
    }
}