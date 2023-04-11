import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        boolean pertence = false;

        int f1 = 0;
        int f2 = 1;
        int fibonacci = 0;

        while (fibonacci <= numero) {
            if (fibonacci == numero) {
                pertence = true;
                break;
            }
            fibonacci = f1 + f2;
            f1 = f2;
            f2 = fibonacci;
        }

        if (pertence) {
            System.out.println("O número "+numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número "+numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
