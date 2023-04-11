import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        scanner.close();

        char[] caracteres = entrada.toCharArray();
        int tamanho = caracteres.length;

        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }

        String saida = new String(caracteres);
        System.out.println("String invertida: " + saida);
    }
}